package home_work_2.presentation;

import java.util.Scanner;

public class Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int num, a, b, i, j, length;
        System.out.print("Введите, сколько чисел вы хотите сгенерировать: ");
        num = sc.nextInt();
        arr = new int[num];

        System.out.println("Сгенерированные числа: ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101); // диапазон [0, 100]
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Выберите интервал для элементов, которые хотите удалить из массива [a, b]:\na: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();

        length = arr.length;
        for (i = 0; i < length; ) {
            if (arr[i] >= a && arr[i] <= b) {
                length--;
                for (j = i; j < length; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[j] = 0;
            } else {
                i++;
            }
        }

        System.out.println("Новый массив с удалёнными элементами: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
