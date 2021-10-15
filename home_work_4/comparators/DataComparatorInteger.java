package home_work_4.comparators;

import java.util.Comparator;

public class DataComparatorInteger implements Comparator<Integer> {

    /**
     * Переопределение метода compare(), для сортировки числа типа Integer по возрастанию
     * @param integer - объект типа Integer
     * @param t1 - объект типа Integer
     * @return число типа int > 0 - если число integer больше t1
     *          число типа int < 0 - если число integer меньше t1
     *                            0 - если возраст одинаковый
     */
    @Override
    public int compare(Integer integer, Integer t1) {
        return integer - t1;
    }
}
