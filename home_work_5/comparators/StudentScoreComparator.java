package home_work_5.comparators;


import home_work_5.dto.Student;

import java.util.Comparator;

public class StudentScoreComparator implements Comparator<Student> {

    /**
     * Переопределение метода compare(), для сортировки среднего балла по убыванию
     * @param student - объект типа Student
     * @param t1 - объект типа Student
     * @return 1 - если оценка первого студента меньше второго
     *          -1 - если оценка второго студента меньше первого
     *            0 - если одинаковые оценки
     */
    @Override
    public int compare(Student student, Student t1) {
        if (student.getAverageScore() < t1.getAverageScore()) {
            return 1;
        } else if (student.getAverageScore() > t1.getAverageScore()) {
            return -1;
        } else {
            return 0;
        }
    }
}
