package home_work_1;

import java.util.Scanner;

public class DivNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOne, numTwo;
        System.out.print("Введите два числа: ");
        numOne = sc.nextInt();
        numTwo = sc.nextInt();
        int quotient = numOne / numTwo; // частное

        if (numOne % numTwo == 0) {
            System.out.println("Первое число делится нацело вторым числом\n" + "Частное: " + quotient);
        } else {
            double remainder = (double) numOne / numTwo;
            System.out.println("Первое число не делится нацело вторым числом\n" + "Частное: " + quotient + " + остаток: " + (remainder - quotient));
        }
    }
}
