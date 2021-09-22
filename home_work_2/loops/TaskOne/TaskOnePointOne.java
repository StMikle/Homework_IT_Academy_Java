package home_work_2.loops.TaskOne;

//   1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//   Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
//   Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//        1.1.1. Используя только цикл

public class TaskOnePointOne {
    public static void main(String[] args) {
        long num = 0;
        try {
            num = Long.parseLong(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Неверный аргумент");
        }

        fact(num);
    }

    public static void fact(long num) {
        boolean check = true;
        long fact = 1;
        int i = 0;
        while (true) {
            if (i < num) {
                try {
                    fact = Math.multiplyExact(fact, ++i);           // метод складывает два числа типа long, если оно вышло за максимальное значение,
                } catch (ArithmeticException e) {                   // то кидает исключение ArithmeticException
                    System.out.println("Вышло за пределы long!!!");
                    check = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (check) {
            showInfo(num, fact);
        }
    }

    public static void showInfo(long num, long fact) {
        for (int i = 1; i <= num; i++) {
            if (i < num) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = " + fact);
            }
        }
        System.out.println("\nФакториал числа " + num + " равен: " + fact);
    }
}

