package home_work_4.comparators;

import java.util.Comparator;

public class DataComparatorInteger implements Comparator<Integer> {
    @Override
    public int compare(Integer integer, Integer t1) {
        return integer - t1;
    }
}
