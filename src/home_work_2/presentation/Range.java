package home_work_2.presentation;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max, step;
        System.out.print("Введите диапазон значений:\nМинимум: ");
        min = sc.nextInt();
        System.out.print("Максимум: ");
        max = sc.nextInt();
        System.out.print("Шаг: ");
        step = sc.nextInt();

        System.out.printf("Ряд чисел в диапазоне [%d,%d] с шагом (%d): ", min, max, step);
        for (int i = min; i <= max; i += step) {
            System.out.print(i + " ");
        }
    }
}
