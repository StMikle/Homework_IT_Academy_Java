package home_work_2.loops.TaskOne;

//1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
// Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
// Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//        1.1.2.* Используя рекурсию

public class TaskOne_2 {
    public static void main(String[] args) {
        long fact = 1;
        long num = 0;
        try {
            num = Long.parseLong(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Неверный аргумент");
        }

        if (num < 0) {
            System.out.println("Введите положительное число !!!");
            return;
        } else {
            fact = fact(num);
        }
        // выводим полное вычисление факториала
        showInfo(num, fact);
    }

    public static void showInfo(long num, long fact) {
        if (fact == -1) {
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (i < num) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = " + fact);
            }
        }
        System.out.println("\nФакториал числа " + num + " равен: " + fact);
    }

    public static long fact(long num) {
        long fact = 1;
        if (num == 0 || num == 1) {
            return fact;
        }
        try {
            fact = Math.multiplyExact(num, fact(num - 1));
        } catch (ArithmeticException e) {
            System.out.println("Вышло за пределы long!!!");
            return -1;
        }
        return fact;
    }
}

