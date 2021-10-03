package home_work_4.comparators;

import home_work_4.dto.Student;

import java.util.Comparator;

public class StudentScoreComparator implements Comparator<Student> {

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
