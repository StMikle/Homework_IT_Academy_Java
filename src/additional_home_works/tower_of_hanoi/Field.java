package additional_home_works.tower_of_hanoi;

public class Field {
    private int[][] field;

    Field(int numRing) {
        field = new int[numRing][3];
    }

    public void setField(int[][] field) {
        this.field = field;
    }

    public int[][] getField() {
        return field;
    }

    // заполнение поля
    static void inputField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (j == 0) field[i][j] = i + 1;
                else field[i][j] = 0;
            }
        }
    }

    // вывод поля
    static void showField(int[][] arr) {
        System.out.println("\nВывод поля: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) System.out.print("*\t");
                else System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static boolean chekInputFromTo(int direct) {
        return direct > 0 && direct < 4;
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