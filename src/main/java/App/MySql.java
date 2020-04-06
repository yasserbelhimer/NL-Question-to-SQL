package App;

import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import info.debatty.java.stringsimilarity.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MySql {
    private Connection connexion;
    public MySql(){
        loadDatabase();
    }

    public String getResult(String string) {

        Statement statement = null;
        ResultSet resultat = null;
        String myString = new String();
        try {
            statement = connexion.createStatement();
            resultat = statement.executeQuery(string);
            while (resultat.next()) {
                String nom = resultat.getString(1);
                String prenom = resultat.getString(2);
                myString += nom +" "+ prenom +"\n";
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return myString;
    }
    public String getTables() {

        Statement statement = null;
        ResultSet resultat = null;
        String myString = new String();
        try {
            statement = connexion.createStatement();
            resultat = statement.executeQuery("show tables;");
            while (resultat.next()) {
                String table = resultat.getString(1);
                myString += table +"\n";
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return myString;
    }

    public String describeTable(String string) {

        Statement statement = null;
        ResultSet resultat = null;
        String myString = new String();
        try {
            statement = connexion.createStatement();
            resultat = statement.executeQuery("describe "+string);
            while (resultat.next()) {
                String atribute = resultat.getString(1);
                myString += atribute +"\n";
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return myString;
    }
    public String showTables(){
        Statement statement = null;
        ResultSet resultat = null;
        String myString = new String();
        try {
            statement = connexion.createStatement();
            resultat = statement.executeQuery("show tables");
            while (resultat.next()) {
                String atribute = resultat.getString(1);
                myString += atribute +"\n";
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return myString;
    }
    public HashMap<String, HashMap<String, String[]>> getMeasersAndDimensions(){
        HashMap<String, HashMap<String, String[]>>  dic = new HashMap<String, HashMap<String, String[]>>();
        HashMap<String,String[]> measers  = new HashMap<String,String[]>();
        HashMap<String,String[]> dimensions  = new HashMap<String,String[]>();
        
        String pattern="(degree|amount|total|numbre|volume|percentage|quantity)";
        Pattern r = Pattern.compile(pattern);
        JaroWinkler jw = new JaroWinkler();

        String[] tables = showTables().split("\n");
        String table = new String();
        for (String myTable : tables){
            String[] tableDesc = describeTable(myTable).split("\n");
            for(String atribut : tableDesc){
                Matcher m = r.matcher(atribut.toLowerCase());
                if((m.find())&&(!measers.containsKey(myTable))){
                    measers.put(myTable,tableDesc);
                    break;                        
                }
            }
            if(!measers.containsKey(myTable)){
                if(!dimensions.containsKey(myTable))
                    dimensions.put(myTable,tableDesc);
            }
        }
        dic.put("measers",measers);
        dic.put("dimensions",dimensions);
        return dic ;
    }
    private void loadDatabase() {
        // Chargement du driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }
        try {
            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3305/datawarehouse", "root", "yasser");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
