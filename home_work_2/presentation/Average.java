package home_work_2.presentation;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int num, sum;
        double average;
        System.out.print("Введите, сколько чисел вы хотите сгенерировать: ");
        num = sc.nextInt();
        arr = new int[num];

        sum = 0;
        System.out.println("Сгенерированные числа: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101); // диапазон [0, 100]
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        average = (double) sum / num;
        System.out.printf("Числа в массиве меньше среднего арифметического всех чисел (%.3f): ", average);
        for (int i: arr) {
            if (i < average) {
                System.out.print(i + " ");
            }
        }
    }
}
