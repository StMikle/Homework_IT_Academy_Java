package additional_home_works.tower_of_hanoi;

import java.util.Scanner;

import static additional_home_works.tower_of_hanoi.Field.chekInput;

public class Menu {

    public int selectGameMode() {
        Scanner sc = new Scanner(System.in);
        int mode;
        do {
            System.out.println("Введите режим игры: 1 - ручной, 2 - робот нуб");
            if (Field.exp(sc.hasNextInt(), sc)) {
                mode = sc.nextInt();
                if (!(mode > 0 && mode < 3)) System.out.println("Введите правильный режим игры !!!\n");
                else break;
            }
        } while (true);
        return mode;
    }

    public int selectNumRings() {
        Scanner sc = new Scanner(System.in);
        int numRings;

        do {
            System.out.println("Укажите количество колец с которыми вы будете играть. Минимальное - 3, максимальное - 8");
            if (Field.exp(sc.hasNextInt(), sc)) {
                numRings = sc.nextInt();
                if (!(numRings > 2 && numRings < 9)) {
                    System.out.println("Введите правильное количество колец !!!\n");
                } else {
                    break;
                }
            }
        } while (true);

        return numRings;
    }

    public int[] selectFromToManualMode(Field field) {
        Scanner sc = new Scanner(System.in);
        int[] fromTo = new int[2];
        int from = 0, to;
        boolean isFrom = false, answerFromField;
        do {

            if (!isFrom) {
                System.out.println("Выберите откуда хотите переместить кольцо (... -> y): ");
                if (Field.exp(sc.hasNextInt(), sc)) {
                    from = sc.nextInt();
                    isFrom = true;
                } else {
                    continue;
                }
            }

            System.out.printf("\nВыберите куда хотите переместить кольцо (%d -> ...): ", from);
            if (Field.exp(sc.hasNextInt(), sc)) {
                to = sc.nextInt();
            } else {
                continue;
            }

            System.out.println(from + " -> " + to);
            answerFromField = chekInput(from, to, field.getField());
            if (answerFromField) {
                fromTo[0] = from;
                fromTo[1] = to;
                break;
            } else {
                isFrom = false;
            }
        } while (true);
        return fromTo;
    }

}
