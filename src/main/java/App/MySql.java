package App;

import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import info.debatty.java.stringsimilarity.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import SDM.Concept;
import SDM.Sdm;

public class MySql {
    public static Connection connexion;
    public MySql(){
    }
    public static ArrayList<String> getResult(String string) {

        Statement statement = null;
        ResultSet resultat = null;
        ResultSetMetaData resultMeta = null;
        String myString = new String();
        ArrayList<String> myResults = new ArrayList<>();
        try {
            statement = connexion.createStatement();
            resultat = statement.executeQuery(string);
            resultMeta = resultat.getMetaData();

            // On affiche le nom des colonnes
            myString  = "";
            for (int i = 1; i <= resultMeta.getColumnCount(); i++){
                myString += resultMeta.getColumnName(i).toUpperCase() + "$";
            }
            myResults.add(myString);
            while (resultat.next()) {
                myString = "";
                for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    myString+=resultat.getObject(i).toString() + "$";
                }
                myResults.add(myString);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Error : MySql cannot execute the query");
        }
        return myResults;
    }
    
    public static ArrayList<String> getFilterValue(String string,String attribute) {

        Statement statement = null;
        ResultSet resultat = null;
        ArrayList<String> myResults = new ArrayList<>();
        try {
            statement = connexion.createStatement();
            resultat = statement.executeQuery(string);

            // On affiche le nom des colonnes
            while (resultat.next()) {
                myResults.add(resultat.getString(attribute.toUpperCase()));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Error : MySql cannot execute the query");
        }
        return myResults;
    }

    public static String getTables() {
        Statement statement = null;
        ResultSet resultat = null;
        String myString = new String();
        try {
            statement = connexion.createStatement();
            resultat = statement.executeQuery("show tables");
            while (resultat.next()) {
                String atribute = resultat.getString(1);
                myString += atribute + "\n";
            }
        } catch (SQLException e) {
            System.out.println("Error : cannot show tables");
        }
        return myString;
    }

    public static String describeTable(String string) {

        Statement statement = null;
        ResultSet resultat = null;
        String myString = new String();
        try {
            statement = connexion.createStatement();
            resultat = statement.executeQuery("describe " + string);
            while (resultat.next()) {
                String atribute = resultat.getString(1);
                myString += atribute + "\n";
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return myString;
    }

    public String showTables() {
        Statement statement = null;
        ResultSet resultat = null;
        String myString = new String();
        try {
            statement = connexion.createStatement();
            resultat = statement.executeQuery("show tables");
            while (resultat.next()) {
                String atribute = resultat.getString(1);
                myString += atribute + "\n";
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return myString;
    }

    public HashMap<String, HashMap<String, String[]>> getMeasersAndDimensions() {
        HashMap<String, HashMap<String, String[]>> dic = new HashMap<String, HashMap<String, String[]>>();
        HashMap<String, String[]> measers = new HashMap<String, String[]>();
        HashMap<String, String[]> dimensions = new HashMap<String, String[]>();

        String pattern = "(degree|amount|total|numbre|volume|percentage|quantity)";
        Pattern r = Pattern.compile(pattern);
        JaroWinkler jw = new JaroWinkler();

        String[] tables = showTables().split("\n");
        String table = new String();
        for (String myTable : tables) {
            String[] tableDesc = describeTable(myTable).split("\n");
            for (String atribut : tableDesc) {
                Matcher m = r.matcher(atribut.toLowerCase());
                if ((m.find()) && (!measers.containsKey(myTable))) {
                    measers.put(myTable, tableDesc);
                    break;
                }
            }
            if (!measers.containsKey(myTable)) {
                if (!dimensions.containsKey(myTable))
                    dimensions.put(myTable, tableDesc);
            }
        }
        dic.put("measers", measers);
        dic.put("dimensions", dimensions);
        return dic;
    }

    //----------- get the primary keys of tables -------------
    public static String getPKey(String table){
        String pk = new String();
        try {
            DatabaseMetaData metaData = connexion.getMetaData();            
            ResultSet resultat = metaData.getPrimaryKeys(null, null, table);
            while (resultat.next()) {
                pk = resultat.getString("COLUMN_NAME");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Error : cannot get the primary key");
        }
        return pk;
    }
    //----------- get the Exported PKeys of tables -------------
    public static HashMap<String,String> getExportedKeys(String table){
        HashMap<String,String> exportedKeys = new HashMap<>();
        try {
            DatabaseMetaData metaData = connexion.getMetaData();            
            ResultSet resultat = metaData.getExportedKeys(null, null, table);
            while (resultat.next()) {
                exportedKeys.put(resultat.getString("PKCOLUMN_NAME"), resultat.getString("PKTABLE_NAME"));
            }
        } catch (SQLException e) {
            System.out.println("Error : cannot get the foring keys");
        }
        return exportedKeys;
    }
    public static String getCommunTable(String table1,String table2){
        ArrayList<ArrayList<String>> ways = new ArrayList<>();
        ArrayList<String> expo1 = new ArrayList<>();
        ArrayList<String> expo2 = new ArrayList<>();
        ArrayList<String> fact = new ArrayList<>();
        String commun = "";
        for(Concept con: Sdm.fact){
            fact.add(con.getTable());
        }
        try {
            DatabaseMetaData metaData = connexion.getMetaData();            
            ResultSet resultat = metaData.getExportedKeys(null, null, table1);
            while (resultat.next()) {
                if(!expo1.contains(resultat.getString("FKTABLE_NAME")))
                    expo1.add(new String(resultat.getString("FKTABLE_NAME")));
            }
        } catch (SQLException e) {
            System.out.println("Error : cannot get the foring keys");
        }

        try {
            DatabaseMetaData metaData = connexion.getMetaData();            
            ResultSet resultat = metaData.getExportedKeys(null, null, table2);
            while (resultat.next()) {
                if(!expo2.contains(resultat.getString("FKTABLE_NAME")))
                    expo2.add(new String(resultat.getString("FKTABLE_NAME")));
            }
        } catch (SQLException e) {
            System.out.println("Error : cannot get the foring keys");
        }
        for(String fac :fact){
            if(expo1.contains(fac) && expo2.contains(fac)){
                commun = fac;
                break;
            }
        }
        return commun;
    }
    //----------- get the Imported PKeys of tables -------------
    public static HashMap<String,String> getImportedKeys(String table){
        HashMap<String,String> importedKeys = new HashMap<>();
        try {
            DatabaseMetaData metaData = connexion.getMetaData();            
            //ResultSet resultat = metaData.getPrimaryKeys(null, null, table);
            ResultSet resultat = metaData.getImportedKeys(null, null, table);
            while (resultat.next()) {
                importedKeys.put(resultat.getString("PKCOLUMN_NAME"), resultat.getString("PKTABLE_NAME"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Error : cannot get the foring keys");
        }
        return importedKeys;
    }

        //----------- get the Exported FKeys of tables -------------
        public static HashMap<String,String> getExportedFKeys(String table){
            HashMap<String,String> exportedKeys = new HashMap<>();
            try {
                DatabaseMetaData metaData = connexion.getMetaData();            
                ResultSet resultat = metaData.getExportedKeys(null, null, table);
                while (resultat.next()) {
                    exportedKeys.put(resultat.getString("FKCOLUMN_NAME"), resultat.getString("FKTABLE_NAME"));
                }
            } catch (SQLException e) {
                System.out.println("Error : cannot get the foring keys");
            }
            return exportedKeys;
        }
    
        //----------- get the Exported FKeysTables of tables -------------
        public static ArrayList<String> getKeysTables(String table){
            ArrayList<String> exportedTables = new ArrayList<>();
            try {
                DatabaseMetaData metaData = connexion.getMetaData();            
                ResultSet resultat = metaData.getExportedKeys(null, null, table);
                while (resultat.next()) {
                    if(!exportedTables.contains(resultat.getString("FKTABLE_NAME")))
                        exportedTables.add(resultat.getString("FKTABLE_NAME"));
                    if(!exportedTables.contains(resultat.getString("PKTABLE_NAME")))
                        exportedTables.add(resultat.getString("PKTABLE_NAME"));
                }
                ResultSet resultat1 = metaData.getImportedKeys(null, null, table);
                while (resultat1.next()) {
                    if(!exportedTables.contains(resultat1.getString("FKTABLE_NAME")))
                        exportedTables.add(resultat1.getString("FKTABLE_NAME"));
                    if(!exportedTables.contains(resultat1.getString("PKTABLE_NAME")))
                        exportedTables.add(resultat1.getString("PKTABLE_NAME"));
                }
            } catch (SQLException e) {
                System.out.println("Error : cannot get the foring keys");
            }
            return exportedTables;
        }
        public static ArrayList<String> getImportedTables(String table){
            ArrayList<String> exportedTables = new ArrayList<>();
            try {
                DatabaseMetaData metaData = connexion.getMetaData();            
                // ResultSet resultat = metaData.getExportedKeys(null, null, table);
                // while (resultat.next()) {
                //     if(!exportedTables.contains(resultat.getString("FKTABLE_NAME")))
                //         exportedTables.add(resultat.getString("FKTABLE_NAME"));
                //     if(!exportedTables.contains(resultat.getString("PKTABLE_NAME")))
                //         exportedTables.add(resultat.getString("PKTABLE_NAME"));
                // }
                ResultSet resultat1 = metaData.getImportedKeys(null, null, table);
                while (resultat1.next()) {
                    if(!exportedTables.contains(resultat1.getString("FKTABLE_NAME")))
                        exportedTables.add(resultat1.getString("FKTABLE_NAME"));
                    // if(!exportedTables.contains(resultat1.getString("PKTABLE_NAME")))
                    //     exportedTables.add(resultat1.getString("PKTABLE_NAME"));
                }
            } catch (SQLException e) {
                System.out.println("Error : cannot get the foring keys");
            }
            return exportedTables;
        }
    //----------- get the Exported FKeysTables of tables -------------
    public static ArrayList<String[]> getKeysAndTables(String table){
        ArrayList<String[]> exportedTables = new ArrayList<>();
        try {
            DatabaseMetaData metaData = connexion.getMetaData();            
            ResultSet resultat = metaData.getExportedKeys(null, null, table);
            while (resultat.next()) {
                String[] temp1 = {resultat.getString("FKTABLE_NAME"),resultat.getString("FKCOLUMN_NAME")};
                if(!Analyse.containsTab(exportedTables, temp1))
                    exportedTables.add(temp1);
                String[] temp2 = {resultat.getString("PKTABLE_NAME"),resultat.getString("PKCOLUMN_NAME")};
                if(!Analyse.containsTab(exportedTables,temp2))
                    exportedTables.add(temp2);
            }
            ResultSet resultat1 = metaData.getImportedKeys(null, null, table);
            while (resultat1.next()) {
                String[] temp1 = {resultat1.getString("FKTABLE_NAME"),resultat1.getString("FKCOLUMN_NAME")};
                if(!Analyse.containsTab(exportedTables,temp1))
                    exportedTables.add(temp1);
                String[] temp2 = {resultat1.getString("PKTABLE_NAME"),resultat1.getString("PKCOLUMN_NAME")};
                if(!Analyse.containsTab(exportedTables,temp2))
                    exportedTables.add(temp2);
            }
        } catch (SQLException e) {
            System.out.println("Error : cannot get the foring keys");
        }
        return exportedTables;
    }
    //----------- get the Exported FKeysTables of tables -------------
    public static ArrayList<String[]> getExportedKeysAndTables(String table){
        ArrayList<String[]> exportedTables = new ArrayList<>();
        try {
            DatabaseMetaData metaData = connexion.getMetaData();            
            ResultSet resultat = metaData.getExportedKeys(null, null, table);
            while (resultat.next()) {
                String[] temp1 = {resultat.getString("FKTABLE_NAME"),resultat.getString("FKCOLUMN_NAME")};
                if(!Analyse.containsTab(exportedTables, temp1))
                    exportedTables.add(temp1);
                // String[] temp2 = {resultat.getString("PKTABLE_NAME"),resultat.getString("PKCOLUMN_NAME")};
                // if(!Analyse.containsTab(exportedTables,temp2))
                //     exportedTables.add(temp2);
            }
            ResultSet resultat1 = metaData.getImportedKeys(null, null, table);
            while (resultat1.next()) {
                String[] temp1 = {resultat1.getString("FKTABLE_NAME"),resultat1.getString("FKCOLUMN_NAME")};
                if(!Analyse.containsTab(exportedTables,temp1))
                    exportedTables.add(temp1);
                // String[] temp2 = {resultat1.getString("PKTABLE_NAME"),resultat1.getString("PKCOLUMN_NAME")};
                // if(!Analyse.containsTab(exportedTables,temp2))
                //     exportedTables.add(temp2);
            }
        } catch (SQLException e) {
            System.out.println("Error : cannot get the foring keys");
        }
        return exportedTables;
    }
    //----------- get the Imported FKeys of tables -------------
    public static HashMap<String,String> getImportedFKeys(String table){
        HashMap<String,String> importedKeys = new HashMap<>();
        try {
            DatabaseMetaData metaData = connexion.getMetaData();            
            //ResultSet resultat = metaData.getPrimaryKeys(null, null, table);
            ResultSet resultat = metaData.getImportedKeys(null, null, table);
            while (resultat.next()) {
                importedKeys.put(resultat.getString("FKCOLUMN_NAME"), resultat.getString("FKTABLE_NAME"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Error : cannot get the foring keys");
        }
        return importedKeys;
    }
    //----------- get the FKeys of tables -------------
    public static HashMap<String,String> getKeys(String table){
        HashMap<String,String> keys = new HashMap<>();
        try {
            DatabaseMetaData metaData = connexion.getMetaData();            
            //ResultSet resultat = metaData.getPrimaryKeys(null, null, table);
            ResultSet resultat = metaData.getImportedKeys(null, null, table);
            ResultSet resultat1 = metaData.getExportedKeys(null, null, table);
            while (resultat.next()) {
                //System.out.println("1");
                System.out.println("FKCOLUMN_NAME : "+resultat.getString("FKCOLUMN_NAME")+" | FKTABLE_NAME : "+resultat.getString("FKTABLE_NAME"));
                System.out.println("PKCOLUMN_NAME : "+resultat.getString("PKCOLUMN_NAME")+" | PKTABLE_NAME : "+resultat.getString("PKTABLE_NAME"));
                // keys.put(resultat.getString("FKCOLUMN_NAME"), resultat.getString("FKTABLE_NAME"));
                // keys.put(resultat.getString("PKCOLUMN_NAME"), resultat.getString("PKTABLE_NAME"));
            }
            while(resultat1.next()){
                //System.out.println("2");
                System.out.println("FKCOLUMN_NAME : "+resultat1.getString("FKCOLUMN_NAME")+" | FKTABLE_NAME : "+resultat1.getString("FKTABLE_NAME"));
                System.out.println("PKCOLUMN_NAME : "+resultat1.getString("PKCOLUMN_NAME")+" | PKTABLE_NAME : "+resultat1.getString("PKTABLE_NAME"));
                keys.put(resultat1.getString("FKCOLUMN_NAME"), resultat1.getString("FKTABLE_NAME"));
                keys.put(resultat1.getString("PKCOLUMN_NAME"), resultat1.getString("PKTABLE_NAME"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Error : cannot get the foring keys");
        }
         return keys;
    }

    public static boolean loadDatabase(String server,String username,String password) {
        // Chargement du driver
        boolean conn = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) 
        {
            System.out.println("Error: Driver jdbc");
        }
        try {
            connexion = DriverManager.getConnection("jdbc:mysql://"+server, username, password);
            conn=true;
        } catch (SQLException e) {
            System.out.println("Error: Connexion failed");
            conn =false;
        }
        return conn;
    }
    public static void disconnect(){
        connexion=null;
    }
}
