package home_work_5.comparators;


import home_work_5.dto.Student;

import java.util.Comparator;

/**
 * Класс - компаратор для сортировки поля средней оценки (averageScore)
 * класса Student по возрастанию
 */
public class StudentScoreComparator implements Comparator<Student> {

    /**
     * Переопределение метода compare(), для сортировки среднего балла по возрастанию
     * @param student - объект типа Student
     * @param t1 - объект типа Student
     * @return 1 - если оценка первого студента больше второго
     *          -1 - если оценка первого студента меньше второго
     *            0 - если одинаковые оценки
     */
    @Override
    public int compare(Student student, Student t1) {
        return Double.compare(student.getAverageScore(), t1.getAverageScore());
    }
}
