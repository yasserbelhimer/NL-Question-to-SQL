package SDM;

public class Measure {
    private String name;
    private String table;
    private String column;

    public Measure(String name,String table,String column){
        this.name   = name;
        this.column = column;
        this.table  = table;
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

	public String getColumn() {
		return this.column;
	}

	public void setColumn(String column) {
		this.column = column;
	}
}