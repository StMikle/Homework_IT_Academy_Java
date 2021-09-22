package home_work_1.task_eight;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        TaskFive_1 testOne = new TaskFive_1();
        TaskFive_2 testTwo = new TaskFive_2();
        TaskFive_3 testThree = new TaskFive_3();
        Scanner sc = new Scanner(System.in);
        String name = null;
        boolean mark = false;

        while (!mark) {
            System.out.print("Введите пожалуйста ваше имя: ");
            name = sc.nextLine();
            if (name != null) {
                mark = true;
            } else {
                System.out.print("Ничего не ввели!!! ");
            }
        }


        System.out.println("Метод класса TaskFive_1: " + testOne.welcome(name));
        System.out.println("\nМетод класса TaskFive_2: " + testTwo.welcome(name));
        System.out.println("\nМетод класса TaskFive_3: " + testThree.welcome(name));

    }
}
