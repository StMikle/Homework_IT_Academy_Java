package additional_home_works.tower_of_hanoi;

import java.util.Scanner;

import static project.Field.*;

public class ManualMode implements project.Actions {
    public static void main(String[] args) {
        ManualMode manMode = new ManualMode();

        System.out.println("\t\t\t\t\tПРАВИЛА ИГРЫ\n Даны три стержня, на один из которых нанизаны восемь колец,\n " +
                "причём кольца отличаются размером и лежат меньшее на большем. Задача состоит в том,\n " +
                "чтобы перенести пирамиду из восьми колец за наименьшее число ходов на другой стержень.\n " +
                "За один раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее.\n");
        Field gameOne = new Field(manMode.choice());
        inputField(gameOne.getField());
        showField(gameOne.getField());
        manMode.game(gameOne.getField());

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


    public void game(int[][] field) {
        long count = 0l;
        Scanner sc = new Scanner(System.in);
        int from, to;
        boolean win = false;
        while (!win) {

            choiceFromTo(field);
//            count = move(field, from, to, count);
            showField(field);
            if (field[0][1] == 1 || field[0][2] == 1) {
                System.out.println("\nЕхууу - Вы выиграли !!!");
                win = true;
            }
        }
    }

    public void choiceFromTo(int[][] field) {
        Scanner sc = new Scanner(System.in);
        int from = 0, to = 0, count = 0;
        boolean isFrom = false, answerFromField;
        do {
            System.out.println("\nВыберите откуда и куда хотите переместить кольцо (x -> y): ");
            if (exp(sc.hasNextInt(), sc) && !isFrom) {
                    from = sc.nextInt();
            } else {
                isFrom = true;
                continue;
            }

            System.out.print(from + " -> ");
            if (exp(sc.hasNextInt(), sc)) {
                to = sc.nextInt();
            } else {
                continue;
            }

            answerFromField = chekInput(from, to, field);
            if (!answerFromField) {
                continue;
            } else {
                move(field, from, to, count);
                break;
            }
        } while (true);
    }


    public int choice() {
        Scanner sc = new Scanner(System.in);
        int mode, numRing;
        do {
            System.out.println("Введите режим игры: 1 - ручной (пока только он), 2 - автоматический");
            if (exp(sc.hasNextInt(), sc)) {
                mode = sc.nextInt();
                if (mode == 2) {
                    System.out.println("Я же написал, пока только 1 -ый режим игры !!!");
                } else if (!(mode > 0 && mode < 3)) System.out.println("Введите правильный режим игры !!!\n");
                else break;
            }
        } while (true);

        do {
            System.out.println("Укажите количество колец с которыми вы будете играть. Минимальное - 3, максимальное - 8");
            if (exp(sc.hasNextInt(), sc)) {
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
