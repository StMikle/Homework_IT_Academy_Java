package home_work_5.comparators;


import home_work_5.dto.Student;

import java.util.Comparator;

public class StudentScoreComparator implements Comparator<Student> {

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
