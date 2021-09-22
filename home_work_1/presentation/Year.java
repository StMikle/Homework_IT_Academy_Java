package home_work_1.presentation;

//Отсюда следует распределение високосных годов:
//        год, номер которого кратен 400, — високосный;
//        остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
//        остальные годы, номер которых кратен 4, — високосные.

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String leapYear = " - високосный";
        String commonYear = " - невисокосный";
        int numOfYears;
        System.out.print("Введите номер года: ");
        numOfYears = sc.nextInt();

        if (numOfYears % 100 == 0) {
            if (numOfYears % 400 == 0) {
                System.out.println(numOfYears + leapYear);
            } else {
                System.out.println(numOfYears + commonYear);
            }
        } else if (numOfYears % 4 == 0) {
            System.out.println(numOfYears + leapYear);
        } else {
            System.out.println(numOfYears + commonYear);
        }
    }
}
