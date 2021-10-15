package home_work_4.dto;

import java.util.Objects;

public class Student implements Comparable<Student>{

    /**
     * Поле типа int для возраста
     */
    private final int age;

    /**
     * Поле типы double для средней оценки
     */
    private final double score;

    /**
     * Конструктор для инициализации полей age и score класса
     * @param age - возраст
     * @param score - средняя оценка
     */
    public Student(int age, double score) {
        this.age = age;
        this.score = score;
    }

    /**
     * Метод (getter), который возвращает поле age
     * @return поле age типа int
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод (getter), который возвращает поле score
     * @return поле score типа double
     */
    public double getScore() {
        return score;
    }

    /**
     * Переопределение метода equals()
     * @param o - переданный объект
     * @return true - если содержание объектов одинаковое
     *          false - если содержание объектов разное
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.score, score) == 0;
    }

    /**
     * Переопределение метода hashCode()
     * @return хеш-код объекта типа int
     */
    @Override
    public int hashCode() {
        return Objects.hash(age, score);
    }

    /**
     * Переопределение метода toString()
     * @return строку типа String содержащую все поля класса Student
     */
    @Override
    public String toString() {
        return "Student{" +
                "age = " + age +
                ", score = " + score +
                '}' + "\n";
    }

    /**
     * Переопределение метода compareTo()
     * @param o - объект типа Student с которым сравниваем
     * @return число типа int > 0 - если возраст сравниваемого объекта больше указанного
     *          число типа int < 0 - если возраст сравниваемого объекта меньше указанного
     *                            0 - если возрасты равны
     */
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
