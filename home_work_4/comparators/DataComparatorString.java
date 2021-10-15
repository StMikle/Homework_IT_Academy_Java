package home_work_4.comparators;

import java.util.Comparator;

public class DataComparatorString implements Comparator<String> {

    /**
     * Переопределение метода compare(), для сортировки строки по возрастанию,
     * который возвращает результат выполнения метода compareTo()
     * @param s - объект типа String
     * @param t1 - объект типа String
     * @return 1 - если строка s больше t1
     *          -1 - если строка s меньше t1
     *            0 - если строки одинаковые
     */
    @Override
    public int compare(String s, String t1) {
        return s.compareTo(t1);
    }
}
