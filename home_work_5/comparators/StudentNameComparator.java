package home_work_5.comparators;

import home_work_5.dto.Student;

import java.util.Comparator;

/**
 * Класс - компаратор для сортировки поля имени (name) класса Student по возрастанию
 */
public class StudentNameComparator implements Comparator<Student> {

    /**
     * Переопределение метода compare(), для сортировки имени по возрастанию,
     * который возвращает результат выполнения метода compareTo()
     * @param o1 - объект типа Student
     * @param o2 - объект типа Student
     * @return 1 - если имя первого студента больше второго
     *          -1 - если имя первого студента меньше второго
     *            0 - если имена одинаковые
     */
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
