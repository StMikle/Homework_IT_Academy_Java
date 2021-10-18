package home_work_6.comparators;

import java.util.Comparator;
import java.util.Map;

public class MapValueComparator implements Comparator<Map.Entry<String, Long>> {

    /**
     * Переопределение метода compare(), для сортировки значения мапы по убыванию
     * @param o1 - объект типа Map.Entry<String, Long>
     * @param o2 - объект типа Map.Entry<String, Long>
     * @return 1 - если значение первого мапа меньше второго
     *          -1 - если значение второго мапа меньше первого
     *            0 - если одинаковые значения
     */
    @Override
    public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
        if (o1.getValue() < o2.getValue()) {
            return 1;
        } else if (o1.getValue() > o2.getValue()) {
            return -1;
        } else {
            return 0;
        }
    }
}
