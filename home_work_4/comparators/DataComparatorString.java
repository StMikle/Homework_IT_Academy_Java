package home_work_4.comparators;

import java.util.Comparator;

public class DataComparatorString implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        return s.compareTo(t1);
    }
}
