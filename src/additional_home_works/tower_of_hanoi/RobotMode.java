package additional_home_works.tower_of_hanoi;

import java.util.Random;

import static project.Field.inputField;
import static project.Field.showField;

public class RobotMode implements project.Actions {
    public static void main(String[] args) {
        RobotMode robMode = new RobotMode();


        System.out.println("\t\t\t\t\tПРАВИЛА ИГРЫ\n Даны три стержня, на один из которых нанизаны восемь колец,\n " +
                "причём кольца отличаются размером и лежат меньшее на большем. Задача состоит в том,\n " +
                "чтобы перенести пирамиду из восьми колец за наименьшее число ходов на другой стержень.\n " +
                "За один раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее.\n");
        Field gameOne = new Field(robMode.choice());
        inputField(gameOne.getField());
        showField(gameOne.getField());
        robMode.game(gameOne.getField());
    }

    public long move(int[][] field, int from, int to, long count) {
        int temp;
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
        } else if (field[field.length - 1][to - 1] == 0 || field[indFrom][from - 1] < field[indTo + 1][to - 1]) {
            temp = field[indFrom][from - 1];
            field[indFrom][from - 1] = field[indTo][to - 1];
            field[indTo][to - 1] = temp;
            count++;
            System.out.println("\nХод номер: " + count);
        } else {
            System.out.println("\nНевозможно переместить больший диск на меньший !!!");
        }
        return count;
    }

    public void game(int[][] field) {
        Random rand = new Random();
        long count = 0l;
        int from, to;
        boolean win = false;
        while (!win) {
            do {
                System.out.println("\nСгенерируй откуда и куда хочешь переместить кольцо (x -> y): ");
                from = rand.nextInt(3) + 1;
                if (!(from > 0 && from < 4)) System.out.println("Сгенерируй уже наконец правильный номер стержня !!!\n");
                else break;
            } while (true);

            do {
                System.out.print(from + " -> ");
                to = rand.nextInt(3) + 1;
                System.out.println(to);
                if (!(to > 0 && to < 4)) System.out.println("Сгенерируй уже наконец правильный номер стержня !!!\n");
                else break;
            } while (true);
            count = move(field, from, to, count);
            showField(field);
            if (field[0][1] == 1 || field[0][2] == 1) {
                System.out.println("\nЕхууу - Кампуктер выиграл !!!");
                win = true;
            }
        }
    }

    public int choice() {
        Random rand = new Random();
        int mode;
        int numRing;
        do {
            System.out.println("Сгенерируй режим игры: 1 - ручной (пока только он), 2 - автоматический");
            mode = rand.nextInt(2) + 1;
            if (mode == 2) {
                System.out.println("Я же написал, пока только 1 -ый режим игры, тупой компьютер !!!");
            } else if (!(mode > 0 && mode < 3))
                System.out.println("Сгенерируй уже наконец правильный режим игры !!!\n");
            else break;
        } while (true);

        do {
            System.out.println("Сгенерируй количество колец с которыми ты будете играть. Минимальное - 3, максимальное - 8");
            numRing = rand.nextInt(6) + 3;
            if (!(numRing > 2 && numRing < 9)) {
                System.out.println("Сгенерируй уже наконец правильное количество колец !!!\n");
            } else {
                break;
            }
        } while (true);
        return numRing;
    }

}
