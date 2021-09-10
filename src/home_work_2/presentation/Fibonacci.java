package home_work_2.presentation;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов ряда Фибоначчи: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 2;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
