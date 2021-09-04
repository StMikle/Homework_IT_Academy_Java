package home_work_1.task_five;

//5. Разбираемся с операторами ветвления. Используя статью https://metanit.com/java/tutorial/2.9.php запросить у пользователя его имя. В данном задании у вас должно получиться 3 класса.
//        Что в итоге надо сделать (общее условие):
//        1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
//        2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
//        3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
//        Как это сделать:
//        5.1 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if
//        5.2 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if else if
//        5.3 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи switch
//        ВНИМАНИЕ! В примерах if и else if для сравнения имён использовать код вида Objects.equals("Имя1", "Имя2").

import java.util.Scanner;

public class TaskFive_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String wait = "Я тебя так долго ждал";
        System.out.print("Введите пожалуйста ваше имя: ");
        name = sc.next();

        if (name.equals("Вася")) {
            System.out.println("Привет!\n" + wait);
        } else if (name.equals("Анастасия")) {
            System.out.println(wait);
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
