package additional_home_works.tower_of_hanoi;

public class ManualMode {

    public void startManualMode(Menu menu, int numRings) {
        Field field = new Field(numRings);
        field.startGame();
        long count = 0;

        do {
            int[] fromTo = menu.selectFromToManualMode(field);
            int from = fromTo[0];
            int to = fromTo[1];
            field.move(from, to);
            field.showField();
            count++;

        } while (!field.isWin());
        System.out.println("Количество ходов: " + count);
        System.out.println("\nЕхуу, вы выиграли !!!");
    }

}
