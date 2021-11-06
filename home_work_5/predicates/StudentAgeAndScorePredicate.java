package home_work_5.predicates;

import home_work_5.dto.Student;

import java.util.function.Predicate;

/**
 * Класс, реализующий интерфейс Predicate<Student>
 */
public class StudentAgeAndScorePredicate implements Predicate<Student> {

    /**
     * Поле для возраста типа int
     */
    private int age;

    /**
     * Поле для средней оценке типа double
     */
    private double averageScore;

    /**
     * Конструктор для инициализации поле age и averageScore
     * @param age - передаваемый возраст типа int
     * @param averageScore - передаваемая оценка типа double
     */
    public StudentAgeAndScorePredicate(int age, double averageScore) {
        this.age = age;
        this.averageScore = averageScore;
    }

    /**
     * Реализация метода интерфейса Predicate<Student>
     * @param student
     * @return true - если поля age и averageScore меньше либо равны этим же полям класса Student
     *          false - если поля age и averageScore больше либо равны этим же полям класса Student
     */
    @Override
    public boolean test(Student student) {
        return student.getAge() >= this.age && student.getAverageScore() >= this.averageScore;
    }
}
