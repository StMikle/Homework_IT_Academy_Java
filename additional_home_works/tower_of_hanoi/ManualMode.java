package additional_home_works.tower_of_hanoi;

import java.util.Scanner;

import static additional_home_works.tower_of_hanoi.Field.*;

public class ManualMode {

    public long move(int[][] field, int from, int to, long count) {
        int temp, indFrom = 0, indTo = 0;

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

        temp = field[indFrom][from - 1];
        field[indFrom][from - 1] = field[indTo][to - 1];
        field[indTo][to - 1] = temp;
        count++;
        return count;
    }


    public void game(Field fieldManMod) {
        long count = 0l;
        Scanner sc = new Scanner(System.in);
        int from, to;
        int[] fromTo = {};
        boolean win = false;
        fieldManMod.setField(choice(fieldManMod));
        fieldManMod.showField();
        int[][] field = fieldManMod.getField();
        while (!win) {

            fromTo = choiceFromTo(fieldManMod);
            move(field, fromTo[0], fromTo[1], count);
            fieldManMod.showField();
            if (field[0][2] == 1) {
                System.out.println("\nЕхууу - Вы выиграли !!!");
                win = true;
            }
        }
    }

    public int[] choiceFromTo(Field fieldManMod) {
        Scanner sc = new Scanner(System.in);
        int[] fromTo = new int[2];
        int from, to, count = 0;
        boolean isFrom = false, answerFromField;
        do {
            System.out.println("\nВыберите откуда и куда хотите переместить кольцо (x -> y): ");
            if (fieldManMod.exp(sc.hasNextInt(), sc) && !isFrom) {
                from = sc.nextInt();
            } else {
                isFrom = true;
                continue;
            }

            System.out.print(from + " -> ");
            if (fieldManMod.exp(sc.hasNextInt(), sc)) {
                to = sc.nextInt();
            } else {
                continue;
            }

            answerFromField = chekInput(from, to, fieldManMod.getField());
            if (!answerFromField) {
                continue;
            } else {
                fromTo[0] = from;
                fromTo[1] = to;
                break;
            }
        } while (true);
        return fromTo;
    }


    public int choice(Field fieldManMod) {
        Scanner sc = new Scanner(System.in);
        int numRing;

        do {
            System.out.println("Укажите количество колец с которыми вы будете играть. Минимальное - 3, максимальное - 8");
            if (fieldManMod.exp(sc.hasNextInt(), sc)) {
                numRing = sc.nextInt();
                if (!(numRing > 2 && numRing < 9)) {
                    System.out.println("Введите правильное количество колец !!!\n");
                } else {
                    break;
                }
            }
        } while (true);

        return numRing;
    }
}
