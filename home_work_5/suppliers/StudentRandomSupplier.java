package home_work_5.suppliers;

import home_work_5.dto.Student;
import home_work_5.generator.api.INameGenerator;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

/**
 * Класс, реализующий интерфейс Supplier<>
 */
public class StudentRandomSupplier implements Supplier<Student> {

    /**
     * Статическое поле для уникального номера студента
     */
    private static long id = 0;

    /**
     * Поле типа INameGenerator
     */
    private final INameGenerator nameGenerator;

    /**
     * Поле типа ThreadLocalRandom
     */
    private final ThreadLocalRandom rnd;

    /**
     * Конструктор для инициализации полей nameGenerator и ThreadLocalRandom
     * @param nameGenerator - переданная переменная типа класса, реализующего интерфейс INameGenerator
     * @param rnd - переменная типа ThreadLocalRandom для генерации
     */
    public StudentRandomSupplier(INameGenerator nameGenerator, ThreadLocalRandom rnd) {
        this.nameGenerator = nameGenerator;
        this.rnd = rnd;
    }

    /**
     * Реализация метода интерфейса Supplier<Student>, который создаёт студента
     * с сгенерированными параметрами и возвращает его
     * @return созданный студент типа Student
     */
    @Override
    public Student get() {
        Student student = new Student();
        student.setName(nameGenerator.getName());
        student.setAge(rnd.nextInt(1, 100));
        student.setAverageScore(rnd.nextDouble(0, 10));
        student.setOlimpic(rnd.nextBoolean());
        student.setId(++id);

        return student;
    }
}
