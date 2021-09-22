package home_work_2.presentation;

import java.util.Scanner;

public class Flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enterNum;
        int flipNum = 0;
        System.out.print("Введите число: ");
        enterNum = sc.nextInt();

        do {
            flipNum = flipNum * 10 + enterNum % 10;
            enterNum /= 10;
        } while (enterNum != 0);

        System.out.println("Перевёрнутое число: " + flipNum);
    }
}
