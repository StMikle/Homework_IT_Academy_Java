package home_work_2.arrays;

//2.4 Задачи взяты с сайта https://taskcode.ru/array. На сайте есть пояснения по каждой из этих задач.
//    Все задачи в одном классе, в отдельных методах. Для создания массивов использовать ранее созданный arrayRandom.
//        2.4.1. Сумма четных положительных элементов массива
//        2.4.2. Максимальный из элементов массива с четными индексами
//        2.4.3. Элементы массива, которые меньше среднего арифметического
//        2.4.4. Найти два наименьших (минимальных) элемента массива
//        2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
//        2.4.6. Сумма цифр массива
//        Так как я в начале сделал все эти задания из презентации, а потом начал уже смотреть txt файл, то я просто продублирую их здесь

import java.util.Arrays;
import java.util.Scanner;

import static home_work_2.arrays.TaskOne.ArraysUtils.arrayRandom;

public class TaskFour {
    public static void main(String[] args) {
        int[] containerOne = arrayRandom(20, 100);
        System.out.println("Сгенерированный массив: " + Arrays.toString(containerOne));
//      2.4.1.
        sumOddPositive(containerOne);
//      2.4.2.
        maxIndex(containerOne);
//      2.4.3.
        average(containerOne);
//      2.4.4.
        twoMinNum(containerOne);
//      2.4.5.
        compression(containerOne);
//      2.4.6.
        int[] containerTwo = arrayRandom(10, 100);
        System.out.print("\n\nНовый сгенерированный массив: " + Arrays.toString(containerTwo) + "\n");
        sumNumArray(containerTwo);
    }

    //  2.4.1. Сумма четных положительных элементов массива
    public static void sumOddPositive(int[] arr) {
        int sum = 0;
        System.out.print("\nЧётные положительные числа: ");
        for (int i : arr) {
            if (i > 0 && i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nСумма чётных положительных чисел: " + sum + "\n");
    }

    //  2.4.2. Максимальный из элементов массива с четными индексами
    public static void maxIndex(int[] arr) {
        int ind = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && max < arr[i]) {
                max = arr[i];
                ind = i;
            }
        }
        System.out.printf("Максимальное значение элемента с чётным индексом [%d]: %d\n", ind, max);
    }

    //  2.4.3. Элементы массива, которые меньше среднего арифметического
    public static void average(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double average = (double) sum / arr.length;

        System.out.printf("\nЧисла в массиве меньше среднего арифметического всех чисел (%.3f): ", average);
        for (int i : arr) {
            if (i < average) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //   2.4.4. Найти два наименьших (минимальных) элемента массива
    public static void twoMinNum(int[] arr) {
        int minOne = arr[0];
        int minIndOne = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minOne > arr[i]) {
                minOne = arr[i];
                minIndOne = i;
            }
        }

        int minTwo = arr[0];
        int minIndTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minTwo > arr[i] && minIndOne != i) {
                minTwo = arr[i];
                minIndTwo = i;
            }
        }

        System.out.printf("\nДва минимальных числа в массиве под индексами:  arr[%d] = %d | arr[%d] = %d\n", minIndOne, minOne, minIndTwo, minTwo);
    }

    //   2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
    public static void compression(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.print("\nВыберите интервал для элементов, которые хотите удалить из массива [a, b]:\na: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        int length = arr.length;
        for (i = 0; i < length; ) {
            if (arr[i] >= a && arr[i] <= b) {
                length--;
                for (j = i; j < length; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[j] = 0;
            } else {
                i++;
            }
        }

        System.out.print("Новый массив с удалёнными элементами: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

//  2.4.6. Сумма цифр массива
    public static void sumNumArray(int[] arr) {
        int sum = 0;
        String temp;
        int[] arrTemp;
        System.out.print("\nСумма всех чисел целочисленного массива: ");
        for (int i = 0 ; i < arr.length; i++) {
            temp = Integer.toString(arr[i]);
            arrTemp = new int[temp.length()];
            for (int j = 0; j < temp.length(); j++) {
                arrTemp[j] = temp.charAt(j) - '0';
                sum += arrTemp[j];
                if (i == arr.length - 1 && j == temp.length() - 1) {
                    System.out.print(arrTemp[j] + " = " + sum);
                } else {
                    System.out.print(arrTemp[j] + " + ");
                }
            }
        }
    }

}
