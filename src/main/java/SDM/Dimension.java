package SDM;

import java.util.ArrayList;

public class Dimension {
    private String name;
    private String fk;
    private ArrayList<Hierarchy> hierarchies ; 

    public Dimension(String name,String fk,ArrayList<Hierarchy> hierarchies){
        this.name           = name;
        this.fk             = fk;
        this.hierarchies    = hierarchies;
    }
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFk() {
		return this.fk;
	}

	public void setFk(String fk) {
		this.fk = fk;
	}

	public ArrayList<Hierarchy> getHierarchies() {
		return this.hierarchies;
	}

	public void setHierarchies(ArrayList<Hierarchy> hierarchies) {
		this.hierarchies = hierarchies;
	}

}