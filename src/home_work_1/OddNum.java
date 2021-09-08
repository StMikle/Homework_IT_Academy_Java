package home_work_1;

public class OddNum {
    public static void main(String[] args) {
        int a, b, res1, res2;
        System.out.println("Генерируется два числа в диапазоне от 0 до 10, одно их которых должно быть чётное, а другое нечётное: ");
        a = (int) (Math.random() * 11);
        b = (int) (Math.random() * 11);
        System.out.println("a: " + a + " | b: " + b);

        res1 = a % 2;
        res2 = b % 2;

        if ((res1 == 0 && res2 == 0) || (res1 != 0 && res2 != 0)) {
            System.out.println("Прибавляем к первому числу единицу:");
            a++;
            System.out.println("a: " + a + " | b: " + b);
        }

        if (a % 2 == 0) {
            System.out.println(a + " - чётное | " + b + " - нечётное");
        } else {
            System.out.println(b + " - чётное | " + a + " - нечётное");
        }
    }
}
