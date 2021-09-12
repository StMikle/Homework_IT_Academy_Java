package home_work_2.presentation;

import java.util.Scanner;

public class MaxIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int num, max, ind;
        System.out.print("Введите, сколько чисел вы хотите сгенерировать: ");
        num = sc.nextInt();
        arr = new int[num];

        ind = 0;
        System.out.println("Сгенерированные числа: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101); // диапазон [0, 100]
            System.out.print(arr[i] + " ");
        }

        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && max < arr[i]) {
                max = arr[i];
                ind = i;
            }
        }

        System.out.printf("Максимальное значение элемента с чётным индексом [%d]: %d",ind, max);
    }
}
