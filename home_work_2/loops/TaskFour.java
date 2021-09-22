package home_work_2.loops;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = 0; long afterLim = 0; long beforeLim = 0;
        long a = 1;
        System.out.print("Введите целое число, которые будете умножать на переменную \"a\": ");

        if (sc.hasNextLong()) {
            num = sc.nextLong();
        } else {
            System.out.println("Просили же нормально!!!");
            return;
        }

        while (true) {
            try {
                afterLim = a * num;
                beforeLim = a;
                a = Math.multiplyExact(a, num);
            } catch (ArithmeticException e) {
                System.out.println("Вышло за пределы long !!!");
                System.out.println("Число перед переполнением: " + beforeLim + "\nЧисло после переполнения: " + afterLim);
                break;
            }
        }
    }
}
