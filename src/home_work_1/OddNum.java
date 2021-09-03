package home_work_1;

public class OddNum {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Генерируется два числа в диапазоне от 0 до 10, одно их которых должно быть чётное, а другое нечётное: ");
        a = (int) (Math.random() * 11);
        b = (int) (Math.random() * 11);
        System.out.println("a: " + a + " | b: " + b);

        if ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)) {
            System.out.println("Прибавляем к первому числу единицу:");
            a++;
            System.out.println("a: " + a + " | b: " + b);
        }

        if (a % 2 == 0) {
            System.out.println(a + " - чётное");
        } else {
            System.out.println(b + " - чётное");
        }
    }
}
