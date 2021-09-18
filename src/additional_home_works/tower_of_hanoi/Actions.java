package additional_home_works.tower_of_hanoi;

public interface Actions {
    void game(int[][] field);
    long move(int[][] field, int from, int to, long count);
    int choice();
}
