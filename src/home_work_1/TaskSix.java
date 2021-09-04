package home_work_1;

//6.* Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимает один параметр
// и будет возвращать строку в отформатированном виде. В метод будет передаваться массив из 10 цифр (от 0 до 9).
// Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX. Например передан массив: {1,2,3,4,5,6,7,8,9,0},
// возвращаемый результат: (123) 456-7890. (Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java).
// В задании нельзя использовать колекции, стрима.

public class TaskSix {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // Заполнения массива циклом for рандомными числами от 0 до 9
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        // Вывод массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(createPhoneNumber(arr));
    }

    public static String createPhoneNumber(int[] arr) {
        String phoneNumber = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                phoneNumber += "(";
                phoneNumber += arr[i];
            } else if (i == 2) {          // Используем конкатенацию чтобы посимвольно записать в строку наши цифры
                phoneNumber += arr[i];
                phoneNumber += ") ";
            } else if (i == 5) {
                phoneNumber += arr[i];
                phoneNumber += "-";
            } else {
                phoneNumber += arr[i];
            }
        }
        return phoneNumber;
    }
}
