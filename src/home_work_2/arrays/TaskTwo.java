package home_work_2.arrays;

//2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя ранее созданный arrayFromConsole.
//    Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода (что такое метод https://metanit.com/java/tutorial/2.7.php):
//        2.2.1. Вывести все элементы в консоль.
//        2.2.2. Вывести каждый второй элемент массива в консоль.
//        2.2.3. Вывести все элементы массива в консоль в обратном порядке.

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class TaskTwo {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        output(container);
        System.out.println();
        outEverySecond(container);
        System.out.println();
        outInReverse(container);
    }

//  2.2.1. Вывести все элементы в консоль.
    public static void output(int[] arr) {
        System.out.println("Вывод всех элементов в консоль:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
//  2.2.2. Вывести каждый второй элемент массива в консоль.
    public static void outEverySecond(int[] arr) {
        System.out.println("Вывод каждого второго элемента массива в консоль:");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//  2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    public static void outInReverse(int[] arr) {
        System.out.println("Вывод всех элементов массива в консоль в обратном порядке:");
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
