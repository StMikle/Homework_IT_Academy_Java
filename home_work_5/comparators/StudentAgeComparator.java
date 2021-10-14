package home_work_5.comparators;

import home_work_5.dto.Student;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    /**
     * Переопределение метода compare(), для сортировки возраста по возрастанию
     * @param student - объект типа Student
     * @param t1 - объект типа Student
     * @return положительное число типа int - если возраст первого студента больше второго
     *          отрицательное число типа int - если возраст первого студента меньше второго
     *                                      0 - если возраст одинаковый
     */
    @Override
    public int compare(Student student, Student t1) {
        return student.getAge() - t1.getAge();
    }
}
