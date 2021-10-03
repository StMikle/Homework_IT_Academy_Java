package home_work_4.comparators;

import home_work_4.dto.Student;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return student.getAge() - t1.getAge();
    }
}
