package home_work_2.loops;

//1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
//  Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
//        1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//        1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//        1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        String strNum = args[0];
        int num;
        double numDoub;
        try {
            num = Integer.parseInt(args[0]);
        } catch(NumberFormatException e) {
            System.out.println("Введено не число !!!");
            return;
        }
        char arr[] = strNum.toCharArray();
        System.out.println(Arrays.toString(arr));
        long multi = 1;
        strNum = args[0];
        for (int i = 0; i < strNum.length(); i++) {
            num = arr[i] - '0';
            multi *= num;
            if (i == strNum.length() - 1) {
                System.out.println(num + " = " + multi);
            } else  {
                System.out.print(num + " * ");
            }
        }
    }
}
