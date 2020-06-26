package SDM;

import java.util.ArrayList;

import com.ibm.icu.impl.UResource.Array;


public class Concept {
    private String name;
    private String table;
    private String id;
    private ArrayList<String> attribute;

    public Concept(String name,String table,String id,ArrayList<String> attribute){
        this.name = name;
        this.table = table;
        this.id = id;
        this.attribute = attribute;
    }
    public Concept(Concept concept){
        this.name = concept.name;
        this.table = concept.table;
        this.id = concept.id;
        this.attribute = new ArrayList<String>(concept.attribute);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTable() {
        return this.table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getAttribute() {
        return this.attribute;
    }

    public void setAttribute(ArrayList<String> attribute) {
        this.attribute = attribute;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (o == this) { 
            return true; 
        } 

        if (!(o instanceof Concept)) { 
            return false; 
        } 

        Concept c = (Concept) o; 
        return (this.name.equals(c.name) && this.table.equals(c.table) && this.id.equals(c.id)); 
    }

    

}