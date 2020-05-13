package App;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



@WebServlet(name = "Tables", urlPatterns = { "tables" }, loadOnStartup = 1)
public class Tables extends HttpServlet {
    public static HashMap<String, String[]> measureTables = new HashMap<String, String[]>();
    public static HashMap<String, String[]> dimensionTable = new HashMap<String, String[]>();
    public static HashMap<String, String[]> temporalLexion = new HashMap<String, String[]>();
    public Tables(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().print(MySql.getTables());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //------------- getting the tables from the user --------------

        String      measures        = request.getParameter("measureTables");
        String      dimensions      = request.getParameter("dimensionTable");
        String      temporals       = request.getParameter("temporalLexion");

        String[]    tables          = MySql.getTables().split("\n");

        Pattern     r1              = Pattern.compile("(time|year|month|day|season|hour|minute|seconde|city)");
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

                        if (m1.find())
                            chance++;

                        Matcher     m2  = r2.matcher(attribute.toLowerCase());

                        if(m2.find())
                            temp = true;

                    }
                    
                    if((chance >= 2) && temp && (!measureTables.containsKey(table))){
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