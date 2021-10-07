package home_work_4.runners;

import home_work_4.comparators.DataComparatorInteger;
import home_work_4.comparators.DataComparatorString;
import home_work_4.comparators.StudentAgeComparator;
import home_work_4.comparators.StudentScoreComparator;
import home_work_4.dto.DataContainer;
import home_work_4.dto.Student;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DataContainerMain {
    public static void main(String[] args) {

//      Контейнер с объектами типа String
        DataContainer<String> container = new DataContainer<>(new String[0]); //Тут есть подвох в конструкторе, он возможно будет выглядеть не так как тут написано, возможно туда придётся что-то передать, думайте пока сами
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        System.out.println(container.toString());
        container.delete(text1);
        System.out.println(container.get(index1)); //Как дела
        System.out.println(container.toString());
        DataComparatorString dataComparatorString = new DataComparatorString();
        System.out.println("После сортировки:");
        container.sort(dataComparatorString);
        System.out.println(container.toString());
        System.out.println();

//      Контейнер с объектами типа String
        DataContainer<Integer> integerDataContainer = new DataContainer<>(new Integer[0]);
        integerDataContainer.add(1);
        integerDataContainer.add(4);
        integerDataContainer.add(6);
        integerDataContainer.add(3);
        System.out.println(integerDataContainer.toString());
        integerDataContainer.delete(Integer.valueOf(4));
        DataComparatorInteger dataComparatorInteger = new DataComparatorInteger();
        DataContainer.sort(integerDataContainer);
//        DataContainer.sort(integerDataContainer, dataComparatorInteger);
        System.out.println(integerDataContainer.toString());
        System.out.println();


//      Контейнер с объектами типа Student
        Student[] students = createStudents();
        DataContainer<Student> studentDataContainer = new DataContainer<>(students);
        System.out.println(studentDataContainer.toString());
        StudentAgeComparator studentAgeComparator = new StudentAgeComparator();
        StudentScoreComparator studentScoreComparator = new StudentScoreComparator();
        // Сортировка по значимости (в начале по возрасту, если он одинаковый, то по баллу)
//        studentDataContainer.sort(studentAgeComparator.thenComparing(studentScoreComparator));
        DataContainer.sort(studentDataContainer); // Сортировка с помощью метода sort c Comparable
        System.out.println("\nПосле сортировки:\n");
        System.out.println(studentDataContainer.toString());

        System.out.println("\nИспользование итератора:\n");
        for (Student student : studentDataContainer) {
            System.out.println(student);
        }

        System.out.println("Использование итератора для удаление объектов\n");
        Iterator<Student> iterTwo = studentDataContainer.iterator();
        while(iterTwo.hasNext()){
            iterTwo.remove();
        }
        System.out.println(studentDataContainer.toString());

    }

    public static Student[] createStudents() {
        Scanner scanner = new Scanner(System.in);
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int num;
        System.out.println("Сколько студентов вы хотите создать:");
        num = scanner.nextInt();
        Student[] students = new Student[num];

        for (int i = 0; i < num; i++) {
            students[i] = new Student(rnd.nextInt(18, 38), rnd.nextDouble(3, 10));
        }

        return students;
    }

}
