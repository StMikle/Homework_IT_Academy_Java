package home_work_2.arrays.TaskOne;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        int[] containerOne = arrayFromConsole();
        System.out.println(Arrays.toString(containerOne));

        int[] containerTwo = arrayRandom(5, 100);
        System.out.println(Arrays.toString(containerTwo));
    }

    public static int[] arrayFromConsole() {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int[] arr;
        System.out.print("Введите размер массива: ");
        if (sc.hasNextInt()) size = sc.nextInt();
        else System.out.println("Введите нормальный размер массива!!!");
        arr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValueExclusion);
        }
        return arr;
    }
}
