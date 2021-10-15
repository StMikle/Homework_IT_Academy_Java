package home_work_4.comparators;

import home_work_4.dto.Student;

import java.util.Comparator;

public class StudentScoreComparator implements Comparator<Student> {

    /**
     * Переопределение метода compare(), для сортировки среднего балла по убыванию
     * @param student - объект типа Student
     * @param t1 - объект типа Student
     * @return 1 - если оценка первого студента больше второго
     *          -1 - если оценка первого студента меньше второго
     *            0 - если одинаковые оценки
     */
    @Override
    public int compare(Student student, Student t1) {
        if (student.getScore() > t1.getScore()) {
            return 1;
        } else if (student.getScore() < t1.getScore()) {
            return -1;
        } else {
            return 0;
        }
    }
}
