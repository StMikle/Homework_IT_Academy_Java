package additional_home_works.tower_of_hanoi;

public class GameMain {
    public static void main(String[] args) {
        Menu menu = new Menu();

        int mode = menu.selectGameMode();
        int numRings = menu.selectNumRings();

        if (mode == 1) {
            ManualMode manualMode = new ManualMode();
            manualMode.startManualMode(menu, numRings);
        }
    }
}
