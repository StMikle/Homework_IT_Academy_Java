package home_work_4.comparators;

import java.util.Comparator;

public class ComparableComparator implements Comparator<Comparable> {
    @Override
    public int compare(Comparable comparable, Comparable t1) {
        return comparable.compareTo(t1);
    }
}
