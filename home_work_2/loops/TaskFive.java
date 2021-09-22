package home_work_2.loops;

//1.5. Вывести таблицу умножения в консоль. В консоли должно получиться так же как и на картинке (динозаврика рисовать не надо):
// https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0

public class TaskFive {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\tТАБЛИЦА УМНОЖЕНИЯ");
        for (int i = 1; i < 11; i++) {
            for (int j = 2; j < 6; j++) {
                System.out.print(j + " x " + i + " = " + i * j);
                if (j < 5) System.out.print("\t|\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");
        for (int i = 1; i < 11; i++) {
            for (int j = 6; j < 10; j++) {
                System.out.print(j + " x " + i + " = " + i * j);
                if (j < 9) System.out.print("\t|\t");
            }
            System.out.println();
        }
    }
}
