package home_work_2.loops;

//1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
//     Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
//     Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
//        1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
//        1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        double num = 0.0;
        double result = 1;
        int pow = 0;
        System.out.println("Введите два числа: первое - число, которое мы будем возводить | второе - степень этого числа");
        System.out.println("Обратите внимание: степень - только положительная и целая, число - любое(положительное/отрицательное, дробное/целое)");


        if (sc.hasNextDouble()) num = sc.nextDouble();
        else check = false;

        if (sc.hasNextInt() && check) {
            pow = sc.nextInt();
            if (pow < 0) {
                check = false;
            }
        } else {
            check = false;
        }

        if (!check) {
            System.out.println("Просил же нормально !!!");
            return;
        }

        // Возведение в степень
        for (int i = 0; i < pow; i++) {
            result *= num;
        }

        System.out.printf("%.2f ^ %d = %.4f",num, pow, result );
    }
}
