package additional_home_works.tower_of_hanoi;

import java.util.Scanner;

public class Field {
    private int[][] field;

    public int[][] getField() {
        return field;
    }

    public void setField(int numRing) {
        this.field = new int[numRing][3];
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (j == 0) field[i][j] = i + 1;
                else field[i][j] = 0;
            }
        }
    }

    // вывод поля
     void showField() {
        System.out.println("\nВывод поля: ");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == 0) System.out.print("*\t");
                else System.out.print(field[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean exp(boolean in, Scanner sc) {
        if (in) {
            return true;
        } else {
            System.out.println("Ввели не число!!!\n");
            sc.next();
            return false;
        }
    }

    static boolean chekInput(int from, int to, int[][] field) {
        if (!(from > 0 && from < 4)) {
            System.out.println("Введите правильный номер стержня c которого вы хотите переместить кольцо !!!\n");
            return false;
        } else if (!(to > 0 && to < 4)) {
            System.out.println("Введите правильный номер стержня на который вы хотите переместить кольцо !!!\n");
            return false;
        }

        int indFrom = 0, indTo = 0;

        for (int i = 0; i < field.length; i++) {
            if (field[i][from - 1] != 0) {
                indFrom = i;
                break;
            } else if (i == field.length - 1) {
                indFrom = field.length - 1;
            }
        }

        for (int i = 0; i < field.length; i++) {
            if (field[i][to - 1] != 0) {
                indTo = i - 1;
                break;
            } else if (i == field.length - 1) {
                indTo = field.length - 1;
            }
        }

        if (field[indFrom][from - 1] == 0) {
            System.out.println("\nВы выбрали номер стержня, на котором нет колец !!!");
            return false;
        } else if (!(field[field.length - 1][to - 1] == 0 || field[indFrom][from - 1] < field[indTo + 1][to - 1])) {
            System.out.println("\nНевозможно переместить больший диск на меньший !!!");
            return false;
        } else {
            return true;
        }
    }
}