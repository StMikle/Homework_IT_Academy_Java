package home_work_5.top_condition;

import home_work_5.dto.Student;
import home_work_5.top_condition.api.ITopCondition;

import java.util.List;

/**
 * Класс, реализующий интерфейс ITopCondition<>
 */
public class TopConditionGroupStudents implements ITopCondition<Student> {

    /**
     * Реализация метода интерфейса ITopCondition<Student>,
     * который выводит заданное количество объектов класса T
     * по каждому полю возраста (age) класса Student
     * @param list - переданная коллекция типа List<T>
     * @param count - заданное количество объектов типа int
     */
    @Override
    public void show(List<Student> list, int count) {
        int index = 0;
        int currentAge = -1;
        for (Student student : list) {
            if(currentAge == -1 || currentAge != student.getAge()) {
                index = 0;
                currentAge = student.getAge();
                System.out.println("\nВозраст: " + student.getAge());
            }

            if (index >= count && currentAge == student.getAge()) {
                continue;
            }

            System.out.println(student);

            index++;
        }
    }
}
