package home_work_2.arrays.TaskThree;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class TestMain {
    public static void main(String[] args) {
        int[] container = arrayRandom(10, 100);
        System.out.println("\tМетоды класса DoWhileOperation:");
        DoWhileOperation doWhile = new DoWhileOperation();
        doWhile.output(container);
        doWhile.outEverySecond(container);
        doWhile.outInReverse(container);

        System.out.println("\n\tМетоды класса ForEachOperation:");
        ForEachOperation forEach = new ForEachOperation();
        forEach.output(container);
        forEach.outEverySecond(container);
        forEach.outInReverse(container);

        System.out.println("\n\tМетоды класса ForOperation:");
        ForOperation forOper = new ForOperation();
        forOper.output(container);
        forOper.outEverySecond(container);
        forOper.outInReverse(container);

        System.out.println("\n\tМетоды класса WhileOperation:");
        WhileOperation whileOper = new WhileOperation();
        whileOper.output(container);
        whileOper.outEverySecond(container);
        whileOper.outInReverse(container);
    }
}
