package home_work_2.presentation;

import java.util.Scanner;

public class TwoMinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int num, minOne, minTwo, minIndOne, minIndTwo;
        System.out.print("Введите, сколько чисел вы хотите сгенерировать: ");
        num = sc.nextInt();
        arr = new int[num];


        System.out.println("Сгенерированные числа: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101); // диапазон [0, 100]
            System.out.print(arr[i] + " ");
        }

        minOne = arr[0];
        minIndOne = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minOne > arr[i]) {
                minOne = arr[i];
                minIndOne = i;
            }
        }

        minTwo = arr[0];
        minIndTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minTwo > arr[i] && minIndOne != i) {
                minTwo = arr[i];
                minIndTwo = i;
            }
        }

        System.out.printf("\nДва минимальных числа в массиве под индексами:  arr[%d] = %d | arr[%d] = %d", minIndOne, minOne, minIndTwo, minTwo);
    }
}
