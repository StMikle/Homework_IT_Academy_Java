package home_work_2.presentation;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        int num;
        String temp;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        num = sc.nextInt();

        temp = Integer.toString(num);
        arr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i) - '0';
        }

        int evenNum = 0;
        int oddNum = 0;

        for (int i = 0; i < temp.length(); i++) {
            if (arr[i] % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }

        System.out.printf("Количество чётных чисел: %d | количество нечётных чисел: %d", evenNum, oddNum);
    }
}
