package home_work_2.arrays.taskThree;

//2.3.3. ForOperation - во всех методах можно использовать только for

public class ForOperation implements IArraysOperation{
    @Override
    public void output(int[] arr) {
        System.out.println("Вывод всех элементов в консоль:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void outEverySecond(int[] arr) {
        System.out.println("Вывод каждого второго элемента массива в консоль:");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void outInReverse(int[] arr) {
        System.out.println("Вывод всех элементов массива в консоль в обратном порядке:");
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
