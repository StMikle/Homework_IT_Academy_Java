package home_work_1.task_eight;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        TaskFive_1 testOne = new TaskFive_1();
        TaskFive_2 testTwo = new TaskFive_2();
        TaskFive_3 testThree = new TaskFive_3();
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Введите пожалуйста ваше имя: ");
        name = sc.next();

        System.out.println("Метод класса TaskFive_1: " + testOne.welcom(name));
        System.out.println("\nМетод класса TaskFive_2: " + testTwo.welcom(name));
        System.out.println("\nМетод класса TaskFive_3: " + testThree.welcom(name));

    }
}
