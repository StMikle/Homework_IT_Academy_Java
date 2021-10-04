package home_work_4.dto;

import java.util.Objects;

public class Student {
    private final int age;
    private final double score;

    public Student(int age, double score) {
        this.age = age;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.score, score) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age = " + age +
                ", score = " + score +
                '}' + "\n";
    }
}
