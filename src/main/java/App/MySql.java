package App;

import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import info.debatty.java.stringsimilarity.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            // TODO Auto-generated catch block
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
