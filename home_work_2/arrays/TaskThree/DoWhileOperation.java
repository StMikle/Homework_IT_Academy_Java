package home_work_2.arrays.TaskThree;

//        2.2.1. Вывести все элементы в консоль.
//        2.2.2. Вывести каждый второй элемент массива в консоль.
//        2.2.3. Вывести все элементы массива в консоль в обратном порядке.
//2.3.1. DoWhileOperation - во всех методах можно использовать только do....while

public class DoWhileOperation implements IArraysOperation {
    @Override
    public void output(int[] arr) {
        int i = 0;
        System.out.println("Вывод всех элементов в консоль:");
        do {
            System.out.print(arr[i] + " ");
            i++;
        } while (i < arr.length);
        System.out.println();
    }

    @Override
    public void outEverySecond(int[] arr) {
        int i = 1;
        System.out.println("Вывод каждого второго элемента массива в консоль:");
        do {
            System.out.print(arr[i] + " ");
            i += 2;
        } while (i < arr.length);
        System.out.println();
    }

    @Override
    public void outInReverse(int[] arr) {
        int i = arr.length - 1;
        System.out.println("Вывод всех элементов массива в консоль в обратном порядке:");
        do {
            System.out.print(arr[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();
    }
}
