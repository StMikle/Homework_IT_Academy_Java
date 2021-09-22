package home_work_1;

import java.util.Scanner;

public class IsLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Введите целое число, обозначающее код символа в таблице ASCII: ");
        num = sc.nextInt();

        if (num >= 65 && num <= 90 || num >= 97 && num <= 122) {
            System.out.println("Введённое число обозначает код английской буквы - " + (char) num);
        } else {
            System.out.println("Введённое число обозначает иной символ - " + (char) num);
        }
    }
}
