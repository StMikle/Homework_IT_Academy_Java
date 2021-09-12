package home_work_2.presentation;

import java.util.Scanner;

public class SumNumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr, arrTemp;
        int num, sum;
        String temp;
        System.out.print("Введите, сколько чисел вы хотите сгенерировать: ");
        num = sc.nextInt();
        arr = new int[num];

        System.out.println("Сгенерированные числа: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101); // диапазон [0, 100]
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sum = 0;
        System.out.print("Сумма всех чисел целочисленного массива: ");
        for (int i = 0 ; i < arr.length; i++) {
            temp = Integer.toString(arr[i]);
            arrTemp = new int[temp.length()];
            for (int j = 0; j < temp.length(); j++) {
                arrTemp[j] = temp.charAt(j) - '0';
                sum += arrTemp[j];
                if (i == arr.length - 1 && j == temp.length() - 1) {
                    System.out.print(arrTemp[j] + " = " + sum);
                } else {
                    System.out.print(arrTemp[j] + " + ");
                }
            }
        }
    }
}
