package home_work_2.presentation;

// Проверить корректность работы генератора псевдослучайных чисел языка программирования с помощью оценки вероятности
// выпадения четных чисел на выборке не меньше 1000 случайных чисел.

import java.util.Scanner;

public class Probability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int genNum;
        int evenNum = 0;
        int oddNum = 0;
        int temp = 0;
        System.out.print("Введите количество случайных чисел (не меньше 1000): ");
        genNum = sc.nextInt();
        for (int i = 0; i < genNum; i++) {
            temp = (int) (Math.random() * 100);
            if (temp % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }

        double percentEven = (double) evenNum / genNum * 100;
        double percentOdd = (double) oddNum / genNum * 100 ;
        System.out.printf("Процент чётных: %.3f | процент нечётных чисел: %.3f", percentEven, percentOdd);
    }
}
