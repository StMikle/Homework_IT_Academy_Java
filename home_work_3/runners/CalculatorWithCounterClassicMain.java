package home_work_3.runners;

//1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        double result;

        double res1 = calc.mult(15, 7);  // 15 * 7
        calc.incrCountOperation();
        double res2 = calc.div(28, 5); // (28 / 5)
        calc.incrCountOperation();
        double res3 = calc.pow(res2, 2); // (28 / 5) ^ 2
        calc.incrCountOperation();
        double res4 = calc.sum(4.1, res1); // 4.1 + 15 * 7
        calc.incrCountOperation();
        result = calc.sum(res4, res3);
        calc.incrCountOperation();

        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
