package App;

public class Term {
    private String term;
    private String table;
    private double pourcentage;

    public Term(String term, String table, double pourcentage) {
        this.term = term;
        this.table = table;
        this.pourcentage = pourcentage;
    }

    public String getTerm() {
        return this.term;
    }

    public String getTable() {
        return this.table;
    }

    public double getPourcentage() {
        return this.pourcentage * 100;
    }

    @Override
    public String toString() {
        return this.term + " : table -> " + this.table + ". pourcentage of similarity : " + this.pourcentage * 100 + "%";
    }
    @Override
    public boolean equals(Object o){
        if (o == this) { 
            return true; 
        } 

        if (!(o instanceof Term)) { 
            return false; 
        }
        Term myTerm = (Term) o; 
        return (this.table.equals(myTerm.table) && this.term.equals(myTerm.term));
    }
}
