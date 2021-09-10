package home_work_2.presentation;

import java.util.Scanner;

public class LargestDigit {
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

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                if (arr[i] == 9) {
                    break;
                }
            }
        }

        System.out.println("Максимальное значение: " + max);
    }
}
