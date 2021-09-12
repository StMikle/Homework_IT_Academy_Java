package home_work_2.arrays.TaskThree;

//2.3.2. WhileOperation - во всех методах можно использовать только while

public class WhileOperation implements IArraysOperation {
    @Override
    public void output(int[] arr) {
        int i = 0;
        System.out.println("Вывод всех элементов в консоль:");
        while (i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    @Override
    public void outEverySecond(int[] arr) {
        int i = 1;
        System.out.println("Вывод каждого второго элемента массива в консоль:");
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i += 2;
        }
        System.out.println();
    }

    @Override
    public void outInReverse(int[] arr) {
        int i = arr.length - 1;
        System.out.println("Вывод всех элементов массива в консоль в обратном порядке:");
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println();
    }
}
