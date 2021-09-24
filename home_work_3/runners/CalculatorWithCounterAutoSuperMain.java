package home_work_3.runners;

//1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
        double result;

        double res1 = calc.mult(15, 7);  // 15 * 7
        double res2 = calc.div(28, 5); // (28 / 5)
        double res3 = calc.pow(res2, 2); // (28 / 5) ^ 2
        double res4 = calc.sum(4.1, res1); // 4.1 + 15 * 7
        result = calc.sum(res4, res3);
        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
