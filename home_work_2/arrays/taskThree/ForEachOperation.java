package home_work_2.arrays.taskThree;

//2.3.4. ForEachOperation - во всех методах можно использовать только foreach

public class ForEachOperation implements IArraysOperation {
    @Override
    public void output(int[] arr) {
        System.out.println("Вывод всех элементов в консоль:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public void outEverySecond(int[] arr) {
        System.out.println("Вывод каждого второго элемента массива в консоль:");
        int count = 1;
        for (int i : arr) {
            if (count % 2 == 0) {
                System.out.print(i + " ");
            }
            count++;
        }
        System.out.println();
    }

    @Override
    public void outInReverse(int[] arr) {
        int[] newArr = new int[arr.length];
        int count = arr.length - 1;
        System.out.println("Вывод всех элементов массива в консоль в обратном порядке:");
        for (int i : arr) {
            newArr[count] = i;
            count--;
        }
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
