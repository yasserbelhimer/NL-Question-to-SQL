package App;

import java.util.*;
import App.Term;

class SortByPourcentage implements Comparator<Term> {
    public int compare(Term a, Term b) {

        int c = (int) a.getPourcentage();
        int d = (int) b.getPourcentage();
        return d - c;
    }
}