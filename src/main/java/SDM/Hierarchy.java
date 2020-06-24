package SDM;

import java.util.ArrayList;

public class Hierarchy {
    private String name;
    private String table;
    private boolean hasAll;
    private String pk;
    private ArrayList<Level> levels;

    

    public Hierarchy(String name,String table,boolean hasAll,String pk,ArrayList<Level> levels){
        this.name   = name;
        this.table  = table;
        this.hasAll = hasAll;
        this.pk     = pk;
        this.levels = levels;
    }
    public ArrayList<Level> getLevels() {
        return this.levels;
    }

    public void setLevels(ArrayList<Level> levels) {
        this.levels = levels;
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

    public boolean isHasAll() {
        return this.hasAll;
    }

    public void setHasAll(boolean hasAll) {
        this.hasAll = hasAll;
    }

    public String getPk() {
        return this.pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

}