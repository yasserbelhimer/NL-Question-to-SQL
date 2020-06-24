package SDM;

import java.util.ArrayList;

public class Sdm {
    public static ArrayList<Measure>    measures            = new ArrayList<>();
    public static ArrayList<Concept>    fact                = new ArrayList<>();
    public static ArrayList<Concept>    sapatialDimension   = new ArrayList<>();
    public static ArrayList<Concept>    temporalDimension   = new ArrayList<>();
    public static ArrayList<Concept>    otherDimension      = new ArrayList<>();

    public static void remplir()
    {
        
        measures.add(new Measure("Quantity stored", "drug_depot", "quantity_stored"));
        measures.add(new Measure("Quantity sold", "drug_sold", "quantity_sold"));

        ArrayList<String> attribute = new ArrayList<>();
        attribute.add("city_name");attribute.add("city_id");
        sapatialDimension.add(new Concept("City", "city", "city_id", new ArrayList<>(attribute)));
        attribute.clear();

        attribute.add("day");attribute.add("day_label");attribute.add("day_id");attribute.add("month_id");
        temporalDimension.add(new Concept("Day", "day", "day_id", new ArrayList<>(attribute)));
        attribute.clear();
        attribute.add("month");attribute.add("month_label");attribute.add("month_id");attribute.add("year_id");
        temporalDimension.add(new Concept("Month", "month", "month_id", new ArrayList<>(attribute)));
        attribute.clear();
        attribute.add("year");attribute.add("year_id");
        temporalDimension.add(new Concept("Year", "year", "year_id", new ArrayList<>(attribute)));
        attribute.clear();

        attribute.add("drug_name");attribute.add("pharmaceutical_form_drug");attribute.add("drug_dosage");attribute.add("expiration_time");attribute.add("drug_id");
        otherDimension.add(new Concept("Drug", "drug", "drug_id", new ArrayList<>(attribute)));
        attribute.clear();
        attribute.add("supplier_name");attribute.add("supplier_account");attribute.add("supplier_address");attribute.add("supplier_phone");attribute.add("supplier_email");attribute.add("supplier_id");
        otherDimension.add(new Concept("Supplier", "supplier", "supplier_id", new ArrayList<>(attribute)));
        attribute.clear();
        attribute.add("consumer_first_name");attribute.add("consumer_last_name");attribute.add("consumer_account");attribute.add("consumer_address");attribute.add("consumer_email");attribute.add("consumer_phone");attribute.add("consumer_id");
        otherDimension.add(new Concept("Consumer", "consumer", "consumer_id", new ArrayList<>(attribute)));
        attribute.clear();
        
        attribute.add("quantity_stored");attribute.add("day_id");attribute.add("city_id");attribute.add("drug_id");attribute.add("supplier_id");
        fact.add(new Concept("Drug stored", "drug_stored",null, new ArrayList<>(attribute)));
        attribute.clear();
        attribute.add("quantity_sold");attribute.add("day_id");attribute.add("city_id");attribute.add("drug_id");attribute.add("consumer_id");
        fact.add(new Concept("Drug sold", "drug_sold", null, new ArrayList<>(attribute)));
        attribute.clear();



    }
}