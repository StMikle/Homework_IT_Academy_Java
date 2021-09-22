package home_work_2.utils;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;
import static home_work_2.utils.ArraysUtils.arrayRandom;

public class SortsUtils {
    public static void main(String[] args) {
//      4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):

//      4.3.1. {1,2,3,4,5,6}
        int[] test = {1, 2, 3, 4, 5, 6};                                   // Исходный массив: [1, 2, 3, 4, 5, 6]
        bubbleSort(test);                                                  // Массив после сортировки пузырьком: [1, 2, 3, 4, 5, 6]
        test = new int[]{1, 2, 3, 4, 5, 6};                                // Массив после шейкерной сортировки: [1, 2, 3, 4, 5, 6]
        shakerSort(test);

//      4.3.2. {1,1,1,1}
        test = new int[]{1, 1, 1, 1};                                      // Исходный массив: [1, 1, 1, 1]
        bubbleSort(test);                                                  // Массив после сортировки пузырьком: [1, 1, 1, 1]
        shakerSort(test);                                                  // Массив после шейкерной сортировки: [1, 1, 1, 1]


//      4.3.3. {9,1,5,99,9,9}
        test = new int[]{9, 1, 5, 99, 9, 9};                               // Исходный массив: [9, 1, 5, 99, 9, 9]
        bubbleSort(test);                                                  // Массив после сортировки пузырьком: [1, 5, 9, 9, 9, 99]
        test = new int[]{9, 1, 5, 99, 9, 9};                               // Массив после шейкерной сортировки: [1, 5, 9, 9, 9, 99]
        shakerSort(test);

//      4.3.4. {}
        test = new int[]{};                                                // Исходный массив: []
        bubbleSort(test);                                                  // Массив после сортировки пузырьком: []
        shakerSort(test);                                                  // Массив после шейкерной сортировки: []



        int[] container = arrayRandom(10, 100);
        bubbleSort(container);

        container = arrayRandom(15, 100);
        shakerSort(container);

        container = arrayFromConsole();
        shakerSort(container);
    }

    //  4.2.1. Пузырьковая сортировка
    public static void bubbleSort(int[] arr) {
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        int i, j, t;
        int size = arr.length;

        for (i = 1; i < size; i++) {
            for (j = size - 1; j >= i; j--) {
                if (arr[j - 1] > arr[j]) {
                    t = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.print("Массив после сортировки пузырьком: ");
        System.out.println(Arrays.toString(arr));
    }

    //  4.2.2. Шейкерная сортировка
    public static void shakerSort(int[] arr) {
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        int t;
        int leftLabel = 1;
        int rightLabel = arr.length - 1;

        while (leftLabel <= rightLabel) {
            for (int i = rightLabel; i >= leftLabel; i--) {
                if (arr[i - 1] > arr[i]) {
                    t = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = t;
                }
            }
            leftLabel++;

            for (int i = leftLabel; i <= rightLabel; i++) {
                if (arr[i - 1] > arr[i]) {
                    t = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = t;
                }
            }
            rightLabel--;
        }

        System.out.print("Массив после шейкерной сортировки: ");
        System.out.println(Arrays.toString(arr) + "\n");
    }
}
