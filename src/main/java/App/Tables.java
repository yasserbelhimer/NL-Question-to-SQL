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

    private ArrayList<Concept> sdmTables ;
    //private ArrayList<Measure> measuress ;

    public static HashMap<String, String[]> measureTables = new HashMap<String, String[]>();
    public static HashMap<String, String[]> dimensionTable = new HashMap<String, String[]>();
    public static HashMap<String, String[]> temporalLexion = new HashMap<String, String[]>();

    public static ArrayList<Measure>    measures            = new ArrayList<>();
    public static ArrayList<Concept>    fact                = new ArrayList<>();
    public static ArrayList<Concept>    sapatialDimension   = new ArrayList<>();
    public static ArrayList<Concept>    temporalDimension   = new ArrayList<>();
    public static ArrayList<Concept>    otherDimension      = new ArrayList<>();
    
    public Tables(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                remplir();
                
        //     sdmTables = new ArrayList<>();
        // ArrayList<String> attribute = new ArrayList<>();
        // attribute.add("city_name");
        // attribute.add("city_id");
        // sdmTables.add(new Concept("City", "city", "city_id", new ArrayList<>(attribute)));
        // attribute.clear();
        // attribute.add("day");attribute.add("day_label");attribute.add("day_id");attribute.add("month_id");
        // sdmTables.add(new Concept("Day", "day", "day_id", new ArrayList<>(attribute)));
        // attribute.clear();
        // attribute.add("month");attribute.add("month_label");attribute.add("month_id");attribute.add("year_id");
        // sdmTables.add(new Concept("Month", "month", "month_id", new ArrayList<>(attribute)));
        // attribute.clear();
        // attribute.add("year");attribute.add("year_id");
        // sdmTables.add(new Concept("Year", "year", "year_id", new ArrayList<>(attribute)));
        // attribute.clear();



        // attribute.add("drug_name");attribute.add("pharmaceutical_form_drug");attribute.add("drug_dosage");attribute.add("expiration_time");attribute.add("drug_id");
        // sdmTables.add(new Concept("Drug", "drug", "drug_id", new ArrayList<>(attribute)));
        // attribute.clear();
        // attribute.add("supplier_name");attribute.add("supplier_account");attribute.add("supplier_address");attribute.add("supplier_phone");attribute.add("supplier_email");attribute.add("supplier_id");
        // sdmTables.add(new Concept("Supplier", "supplier", "supplier_id", new ArrayList<>(attribute)));
        // attribute.clear();
        // attribute.add("consumer_first_name");attribute.add("consumer_last_name");attribute.add("consumer_account");attribute.add("consumer_address");attribute.add("consumer_email");attribute.add("consumer_phone");attribute.add("consumer_id");
        // sdmTables.add(new Concept("Consumer", "consumer", "consumer_id", new ArrayList<>(attribute)));
        // attribute.clear();

        // attribute.add("quantity_stored");attribute.add("day_id");attribute.add("city_id");attribute.add("drug_id");attribute.add("supplier_id");
        // sdmTables.add(new Concept("Drug stored", "drug_stored",null, new ArrayList<>(attribute)));
        // attribute.clear();
        // attribute.add("quantity_sold");attribute.add("day_id");attribute.add("city_id");attribute.add("drug_id");attribute.add("consumer_id");
        // sdmTables.add(new Concept("Drug sold", "drug_sold", null, new ArrayList<>(attribute)));
        // attribute.clear();
            String ConceptTables = "";
            for(Concept concept:sdmTables){
                ConceptTables+=concept.getTable()+"\n";
            }
            response.getWriter().print(ConceptTables);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //------------- getting the tables from the user --------------
        
        String      type            = request.getParameter("type");
        
        if(type.equals("setConcepts")){
            String      meas        = request.getParameter("measures");
            String      fac         = request.getParameter("factTables");
            String      tempDim      = request.getParameter("temporalDimensions");
            String      spatDim       = request.getParameter("spatialDimensions");
            String      othrDim       = request.getParameter("otherDimensions");
            
            String[]      meass        = meas.split(",");
            String[]      facs         = fac.split(",");
            String[]      tempDims      = tempDim.split(",");
            String[]      spatDims       = spatDim.split(",");
            String[]      othrDims       = othrDim.split(",");


            /*-------------------------------------------------------------------------------------- semi automatique ------------------------------------------------------------------------------------*/ Sdm.remplir();


            for(String f:facs){
                for(Concept concept:sdmTables){
                    if(f.equals(concept.getTable())){
                        fact.add(new Concept(concept));
                    }
                }
            }
            for(String m:meass){
                for(Concept concept:fact){
                    if(concept.getAttribute().contains(m)){
                        measures.add(new Measure(concept.getName(),concept.getTable(), m));
                    }
                }
            }
            for(String f:tempDims){
                for(Concept concept:sdmTables){
                    if(f.equals(concept.getTable())){
                        temporalDimension.add(new Concept(concept));
                    }
                }
            }
            for(String f:spatDims){
                for(Concept concept:sdmTables){
                    if(f.equals(concept.getTable())){
                        sapatialDimension.add(new Concept(concept));
                    }
                }
            }
            for(String f:othrDims){
                for(Concept concept:sdmTables){
                    if(f.equals(concept.getTable())){
                        otherDimension.add(new Concept(concept));
                    }
                }
            }

            // String[]    tables          = MySql.getTables().split("\n");

            // Pattern     r1              = Pattern.compile("(time|year|month|day|season|hour|minute|seconde)");
            // Pattern     r2              = Pattern.compile("(degree|amount|total|numbre|volume|percentage|quantity)");
            // // ------------------- generate the temporalLexion hashmap ----------------------
            // String[]    temporalsStrings;
            // temporalLexion.clear();
            // if(!temporals.isBlank()){

            //     temporalsStrings = temporals.split(",");
            //     for(String table : temporalsStrings){

            //         if(!table.isBlank())
            //             temporalLexion.put(table, MySql.describeTable(table).split("\n"));
            //     }

            // }
            // else{
            //     for(String table:tables){

            //         if(!table.isBlank()){

            //             int         chance      = 0;
            //             boolean     temp        = true;
            //             String[]    attributes  = MySql.describeTable(table).split("\n");

            //             for(String attribute : attributes){

            //                 Matcher     m1      = r1.matcher(attribute.toLowerCase());

            //                 if (m1.find())
            //                     chance++;

            //                 Matcher     m2  = r2.matcher(attribute.toLowerCase());

            //                 if(m2.find())
            //                     temp = false;

            //             }
                        
            //             if((chance >= 2) && temp && (!temporalLexion.containsKey(table))){
            //                 temporalLexion.put(table, attributes);
            //             }
            //         }
                    
            //     }

            //     temporalsStrings    = new String[temporalLexion.keySet().size()]; 
            //     temporalsStrings    = temporalLexion.keySet().toArray(temporalsStrings);

            // }

            // // ------------------- generate the measureTables hashMap ----------------------

            // String[] measuresStrings ;
            // measureTables.clear();

            // if(!measures.isBlank()){

            //     measuresStrings = measures.split(",");

            //     for(String table : measuresStrings){

            //         if(!table.isBlank())
            //             measureTables.put(table, MySql.describeTable(table).split("\n"));

            //     }

            // }
            // else{

            //     for(String table:tables){

            //         if((!table.isBlank())&& !contain(temporalsStrings, table)){

            //             int         chance      = 0;
            //             boolean     temp        = false;
            //             String[]    attributes  = MySql.describeTable(table).split("\n");

            //             for(String attribute : attributes){

            //                 Matcher     m1      = r1.matcher(attribute.toLowerCase());

            //                 if (m1.find()){
            //                     chance++;
            //                 }
                            

            //                 Matcher     m2  = r2.matcher(attribute.toLowerCase());

            //                 if(m2.find()){
            //                     temp = true;
            //                 }
            //             }
                        
            //             if((chance >= 1) && temp && (!measureTables.containsKey(table))){
            //                 measureTables.put(table, attributes);
            //             }
            //         }
                    
            //     }

            //     measuresStrings    = new String[measureTables.keySet().size()]; 
            //     measuresStrings    = measureTables.keySet().toArray(measuresStrings);

            // }
            // // ------------------- generate the dimensionTable hashMap ----------------------
           
            // String[] dimensionsStrings ;
            // dimensionTable.clear();

            // if(!dimensions.isBlank()){

            //     dimensionsStrings = dimensions.split(",");

            //     for(String table : dimensionsStrings){

            //         if(!table.isBlank())
            //             dimensionTable.put(table, MySql.describeTable(table).split("\n"));

            //     }

            // }
            // else{

            //     for(String table:tables){

            //         if( !table.isBlank() && !contain(temporalsStrings, table) && !contain(measuresStrings, table))
            //             dimensionTable.put(table, MySql.describeTable(table).split("\n"));
                    
            //     }

            //     dimensionsStrings    = new String[dimensionTable.keySet().size()]; 
            //     dimensionsStrings    = dimensionTable.keySet().toArray(dimensionsStrings);

            // }
            
        }
        else if(type.equals("DecisionMaker")){
            /*---------------------------------------------------------------automatique------------------------------------------------------------------------------------------------- */Sdm.remplir();
            Pattern     r1              = Pattern.compile("(time|year|month|day|season|hour|minute|seconde)");
            Pattern     r2              = Pattern.compile("(city|town|country|village|region)");
            remplir();
            for(Concept concept:sdmTables){
               
                Matcher     m1      = r1.matcher(concept.getName().toLowerCase());
                Matcher     m2      = r2.matcher(concept.getName().toLowerCase());
                if (m1.find()){
                    temporalDimension.add(new Concept(concept));
                }
                else if(m2.find()){
                    sapatialDimension.add(new Concept(concept));
                }
                else{
                    ArrayList<String> f = new ArrayList<>();
                    for(Measure m :measures){
                        f.add(m.getTable());
                    }
                    if(!f.contains(concept.getTable())){
                        otherDimension.add(new Concept(concept));
                    }
                }

            }
            
        }
        else if(type.equals("getAttributes")){
            String      factTable               = request.getParameter("factTable");
            String[]    factTables              = factTable.split(",");
            ArrayList<String> attributes         = new ArrayList<>();
            factTable = "";
            for(String tab:factTables){
                for(Concept concept :sdmTables){
                    if(tab.equals(concept.getTable())){
                        for(String att : concept.getAttribute()){
                            if(!attributes.contains(att)){
                                attributes.add(att);
                                factTable+=att+"\n";
                            }
                        }
                    }
                }
            }
            
            request.setAttribute("factTablesAttributes", factTable);
            request.getRequestDispatcher("factTablesAttributes.jsp").forward(request, response);
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
    private void remplir(){
        String filePath = "src/main/resources/edpfe.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        sdmTables = new ArrayList < Concept > ();
        try
        {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            String xpathExpression = "";
            
            ArrayList<String> attribute = new ArrayList<>();
            measures = new ArrayList<Measure>();

            Element docEle = doc.getDocumentElement();
            NodeList nl = docEle.getElementsByTagName("*");

            if (nl != null)
            {
                int length = nl.getLength();
                for (int i = 0; i < length; i++)
                {
                    Element el = (Element) nl.item(i);

                    if (el.getTagName().equals("Cube"))
                    {
                        Element table = (Element) nl.item(i+1);
                        String tableName = table.getAttribute("name");
                        String[] attributes = MySql.describeTable(tableName).split("\n");
                        for(String s : attributes)
                        {
                            attribute.add(s);
                        }
                            
                        Concept concept = new Concept (el.getAttribute("name"),tableName,null,new ArrayList<>(attribute));
                        if(!sdmTables.contains(concept))
                        {
                            sdmTables.add(concept);
                        }

                        attribute.clear();
                    }

                    if (el.getTagName().equals("Measure"))
                    {
                        String nomMeasure = el.getAttribute("name");
                        String tableName = el.getAttribute("table");
                        String column = el.getAttribute("column");
                        measures.add(new Measure (nomMeasure,tableName,column));
                    }

                    if (el.getTagName().equals("Dimension") && el.getAttribute("type").equals("StandardDimension"))
                    {
                        String nomDimension = el.getAttribute("name");
                        Element table = (Element) nl.item(i+2);
                        String tableName = table.getAttribute("name");
                        String pkKey = table.getAttribute("primaryKey");
                        String[] attributes = MySql.describeTable(tableName).split("\n");
                        for(String s : attributes)
                        {
                            attribute.add(s);
                        }

                        Concept concept = new Concept (nomDimension,tableName,pkKey,new ArrayList<>(attribute));
                        if(!sdmTables.contains(concept))
                        {
                            sdmTables.add(concept);
                        }

                        attribute.clear();
                    }

                    if (el.getTagName().equals("Dimension") && el.getAttribute("type").equals("TimeDimension"))
                    {
                        String nomDimension = el.getAttribute("name");

                        Element table1 = (Element) nl.item(i+2);
                        String table1Name = table1.getAttribute("name");
                        String pkKey1 = table1.getAttribute("primaryKey");
                        String[] attributes1 = MySql.describeTable(table1Name).split("\n");
                        for(String s : attributes1)
                        {
                            attribute.add(s);
                        }
                        
                        Concept concept1 = new Concept (nomDimension+" "+table1Name,table1Name,pkKey1,new ArrayList<>(attribute));
                        if(!sdmTables.contains(concept1))
                        {
                            sdmTables.add(concept1);
                        }

                        attribute.clear();

                        Element table2 = (Element) nl.item(i+3);
                        String table2Name = table2.getAttribute("name");
                        String pkKey2 = table2.getAttribute("primaryKey");
                        String[] attributes2 = MySql.describeTable(table2Name).split("\n");
                        for(String s : attributes2)
                        {
                            attribute.add(s);
                        }

                        Concept concept2 = new Concept (nomDimension+" "+table2Name,table2Name,pkKey2,new ArrayList<>(attribute));
                        if(!sdmTables.contains(concept2))
                        {
                            sdmTables.add(concept2);
                        }
                        
                        attribute.clear();

                        Element table3 = (Element) nl.item(i+4);
                        String table3Name = table3.getAttribute("name");
                        String pkKey3 = table3.getAttribute("primaryKey");
                        String[] attributes3 = MySql.describeTable(table3Name).split("\n");
                        for(String s : attributes3)
                        {
                            attribute.add(s);
                        }

                        Concept concept3 = new Concept (nomDimension+" "+table3Name,table3Name,pkKey3,new ArrayList<>(attribute));
                        if(!sdmTables.contains(concept3))
                        {
                            sdmTables.add(concept3);
                        }

                        attribute.clear();
                    }
                }
            }
        }
        catch (SAXException | ParserConfigurationException | IOException e1)
        {
            e1.printStackTrace();
        }
    }
}