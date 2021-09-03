package home_work_1;

import java.util.Scanner;

public class ThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int greatNum;
        int num1, num2, num3;
        System.out.print("Введите три целых числа: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                greatNum = num1;
            } else {
                greatNum = num3;
            }
        } else if(num2 > num3) {
            greatNum = num2;
        } else {
            greatNum = num3;
        }

        System.out.println("Наибольшее число: " + greatNum);
    }
}
