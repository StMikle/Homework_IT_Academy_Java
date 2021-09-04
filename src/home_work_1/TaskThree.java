package home_work_1;

//3. Изучить библиотеку (класс) Math из jdk. (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)

public class TaskThree {
    public static void main(String[] args) {
        double a, b;
        a = 5.5; b = 10.6;
        // константы
        System.out.println(Math.E);
        System.out.println(Math.PI);

        // минимум и максимум из двух чисел
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));

        // Возведение в степень b числа a
        System.out.println(Math.pow(a,b));

        // модуль числа
        System.out.println(Math.abs(-a));

        // округляет в меньшую сторону
        System.out.println(Math.floor(a));

        // корень числа
        System.out.println(Math.sqrt(b));

        // И ещё много разных методов в этом классе.....
    }
}
