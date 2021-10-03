package additional_home_works.tower_of_hanoi;

import java.util.Random;

public class RobotMode {

    public void startRobotMode(Menu menu, int numRings) {
        Field field = new Field(numRings);
        field.startGame();

        long count = 0l;

        do {
            int[] fromTo = menu.selectFromToRobotMode(field);
            int from = fromTo[0];
            int to = fromTo[1];
            field.move(from, to);
            field.showField();
            count++;

        } while (!field.isWin());
        System.out.println("Количество ходов: " + count);
        System.out.println("\nЕхуу, Кампуктер выиграл !!!");
    }
}
