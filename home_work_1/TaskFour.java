package home_work_1;

//4.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
//        4.1 Данный метод будет принимает два параметра
//        4.2 Будет отвечать на вопрос спать ли дальше (возвращать true либо false).
//        4.3 Первый параметр boolean weekday обозначает рабочий день
//        4.4 Второй параметр boolean vacation обозначает отпуск.
//        4.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
//        4.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ansWeek, ansVoc, ansFinal;
        System.out.print("Введите - true, если сейчас рабочий день, false - если нерабочий день: ");
        ansWeek = sc.nextBoolean();
        System.out.print("Введите - true, если сейчас отпуск, false - если отпуск закончился: ");
        ansVoc = sc.nextBoolean();
        ansFinal = sleepIn(ansWeek, ansVoc);

        if (ansFinal) System.out.println("Можем спать дальше :)");
        else System.out.println("Пора идти на работу :(");
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }
}
