package additional_home_works.tower_of_hanoi;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Field field = new Field();
        ManualMode manMode = new ManualMode();

        if (play(field) == 1) {
            manMode.game(field);
        }

    }

    public static int play(Field field) {
        Scanner sc = new Scanner(System.in);
        int mode;
        do {
            System.out.println("Введите режим игры: 1 - ручной, 2 - робот нуб");
            if (field.exp(sc.hasNextInt(), sc)) {
                mode = sc.nextInt();
                if (!(mode > 0 && mode < 3)) System.out.println("Введите правильный режим игры !!!\n");
                else break;
            }
        } while (true);
        return mode;
    }

}
