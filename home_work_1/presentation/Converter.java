package home_work_1.presentation;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, choose;
        System.out.print("Введите число: ");
        num = sc.nextInt();
        System.out.print("Чтобы перевести в байты, введите - 1, в килобайты - 2: ");
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println(num * 1024 + " байт");
                break;
            case 2:
                System.out.println(num / 1024.0 + " килобайт");
                break;
            default:
                System.out.println("Неверное число!!!");
                break;
        }
    }
}
