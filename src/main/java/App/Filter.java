package App;

public class Filter implements Comparable<Filter> {
    private String filterName;
    private String filterID;
    private String filterTable;
    private String filterValue;
    private double filterpourcentage;

    public Filter(String filterName,String filterID,String filterTable,String filterValue,double filterpourcentage){
        this.filterName         = filterName;
        this.filterID           = filterID;
        this.filterTable        = filterTable;
        this.filterValue        = filterValue;
        this.filterpourcentage  = filterpourcentage;
    }
    
	public String getFilterName() {
		return this.filterName;
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}

	public String getFilterID() {
		return this.filterID;
	}

	public void setFilterID(String filterID) {
		this.filterID = filterID;
	}

	public String getFilterTable() {
		return this.filterTable;
	}

	public void setFilterTable(String filterTable) {
		this.filterTable = filterTable;
	}

	public String getFilterValue() {
		return this.filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}

	public double getFilterpourcentage() {
		return this.filterpourcentage;
	}

	public void setFilterpourcentage(double filterpourcentage) {
		this.filterpourcentage = filterpourcentage;
	}
	@Override
	public String toString(){
		return "filterName : "+this.filterName + "\nfilterID : "+ this .filterID +"\nfilterTable : " +this.filterTable
		+"\nfilterValue : " +this.filterValue + "\nfilterpourcentage : "+this.filterpourcentage;
	}

	public int compareTo(Filter filter) {  
        return this.filterName.compareTo(filter.filterName);  
	}  
	
	@Override
	public boolean equals(Object o){
		if (o == this) { 
            return true; 
        } 

        if (!(o instanceof Filter)) { 
            return false; 
        }
		Filter filter = (Filter) o;
		
		return (this.filterName.equals(filter.filterName) && this.filterValue.equals(filter.filterValue));

	}
}