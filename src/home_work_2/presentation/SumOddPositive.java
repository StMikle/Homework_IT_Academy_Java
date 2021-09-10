package home_work_2.presentation;

import java.util.Scanner;

public class SumOddPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, oddPos, sum;
        int[] arr;
        System.out.print("Введите, сколько чисел вы хотите сгенерировать: ");
        num = sc.nextInt();
        arr = new int[num];

        System.out.println("Сгенерированные числа: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 201) - 100; // диапазон [-100, 100]
        }
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        sum = 0;
        System.out.println("Чётные положительные числа: ");
        for (int i : arr) {
            if (i > 0 && i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nСумма чётных положительных чисел: " + sum);

    }
}
