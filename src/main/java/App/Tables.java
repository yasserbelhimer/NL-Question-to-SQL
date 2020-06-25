package App;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import SDM.Concept;
import SDM.Measure;
import SDM.Sdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



@WebServlet(name = "Tables", urlPatterns = { "tables" }, loadOnStartup = 1)
public class Tables extends HttpServlet {
    private ArrayList<Concept> sdmTables = new ArrayList<>();

    public static HashMap<String, String[]> measureTables = new HashMap<String, String[]>();
    public static HashMap<String, String[]> dimensionTable = new HashMap<String, String[]>();
    public static HashMap<String, String[]> temporalLexion = new HashMap<String, String[]>();
    public Tables(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String filePath = "src/main/resources/edpfe.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Cube");
            // now XML is loaded as Document in memory, lets convert it to Object List
            ArrayList < Concept > concepts = new ArrayList < Concept > ();
// ----------------------------------- put your code here ---------------------------------
            // for (int i = 0; i < nodeList.getLength(); i++) {
            //     concepts.add(new Concept(name, table, id, attribute));
            // }
            // lets print User list information
            // for (User emp: userList) {
            //     System.out.println(emp.toString());
            // }
        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }
        response.getWriter().print(MySql.getTables());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //------------- getting the tables from the user --------------
        Sdm.remplir();
        String      measures        = request.getParameter("measureTables");
        String      dimensions      = request.getParameter("dimensionTable");
        String      temporals       = request.getParameter("temporalLexion");

        String[]    tables          = MySql.getTables().split("\n");

        Pattern     r1              = Pattern.compile("(time|year|month|day|season|hour|minute|seconde)");
        Pattern     r2              = Pattern.compile("(degree|amount|total|numbre|volume|percentage|quantity)");


        // ------------------- generate the temporalLexion hashmap ----------------------
        String[]    temporalsStrings;
        temporalLexion.clear();
        if(!temporals.isBlank()){

            temporalsStrings = temporals.split(",");
            for(String table : temporalsStrings){

                if(!table.isBlank())
                    temporalLexion.put(table, MySql.describeTable(table).split("\n"));
            }

        }
        else{
            for(String table:tables){

                if(!table.isBlank()){

                    int         chance      = 0;
                    boolean     temp        = true;
                    String[]    attributes  = MySql.describeTable(table).split("\n");

                    for(String attribute : attributes){

                        Matcher     m1      = r1.matcher(attribute.toLowerCase());

                        if (m1.find())
                            chance++;

                        Matcher     m2  = r2.matcher(attribute.toLowerCase());

                        if(m2.find())
                            temp = false;

                    }
                    
                    if((chance >= 2) && temp && (!temporalLexion.containsKey(table))){
                        temporalLexion.put(table, attributes);
                    }
                }
                
            }

            temporalsStrings    = new String[temporalLexion.keySet().size()]; 
            temporalsStrings    = temporalLexion.keySet().toArray(temporalsStrings);

        }

        // ------------------- generate the measureTables hashMap ----------------------

        String[] measuresStrings ;
        measureTables.clear();

        if(!measures.isBlank()){

            measuresStrings = measures.split(",");

            for(String table : measuresStrings){

                if(!table.isBlank())
                    measureTables.put(table, MySql.describeTable(table).split("\n"));

            }

        }
        else{

            for(String table:tables){

                if((!table.isBlank())&& !contain(temporalsStrings, table)){

                    int         chance      = 0;
                    boolean     temp        = false;
                    String[]    attributes  = MySql.describeTable(table).split("\n");

                    for(String attribute : attributes){

                        Matcher     m1      = r1.matcher(attribute.toLowerCase());

                        if (m1.find()){
                            chance++;
                        }
                          

                        Matcher     m2  = r2.matcher(attribute.toLowerCase());

                        if(m2.find()){
                            temp = true;
                        }
                    }
                    
                    if((chance >= 1) && temp && (!measureTables.containsKey(table))){
                        measureTables.put(table, attributes);
                    }
                }
                
            }

            measuresStrings    = new String[measureTables.keySet().size()]; 
            measuresStrings    = measureTables.keySet().toArray(measuresStrings);

        }
        // ------------------- generate the dimensionTable hashMap ----------------------

        String[] dimensionsStrings ;
        dimensionTable.clear();

        if(!dimensions.isBlank()){

            dimensionsStrings = dimensions.split(",");

            for(String table : dimensionsStrings){

                if(!table.isBlank())
                    dimensionTable.put(table, MySql.describeTable(table).split("\n"));

            }

        }
        else{

            for(String table:tables){

                if( !table.isBlank() && !contain(temporalsStrings, table) && !contain(measuresStrings, table))
                    dimensionTable.put(table, MySql.describeTable(table).split("\n"));
                
            }

            dimensionsStrings    = new String[dimensionTable.keySet().size()]; 
            dimensionsStrings    = dimensionTable.keySet().toArray(dimensionsStrings);

        }
        
    }

    static boolean contain(String[] tab,String t){

        boolean con = false;

        for(String s : tab){

            if(s.equals(t))
                con=true;
        }

        return con;
    }
}