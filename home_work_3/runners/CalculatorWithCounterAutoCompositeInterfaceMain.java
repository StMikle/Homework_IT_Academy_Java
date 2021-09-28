package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        ICalculator iCalculator;

        System.out.println("CalculatorWithOperator");
        iCalculator = new CalculatorWithOperator();
        CalculatorWithCounterAutoCompositeInterface calc = new CalculatorWithCounterAutoCompositeInterface(iCalculator);
        double result;
        double res1 = calc.mult(15, 7);  // 15 * 7
        double res2 = calc.div(28, 5); // (28 / 5)
        double res3 = calc.pow(res2, 2); // (28 / 5) ^ 2
        double res4 = calc.sum(4.1, res1); // 4.1 + 15 * 7
        result = calc.sum(res4, res3);
        System.out.println(result);
        System.out.println(calc.getCountOperation() + "\n");

        System.out.println("CalculatorWithMathCopy");
        iCalculator = new CalculatorWithMathCopy();
        calc = new CalculatorWithCounterAutoCompositeInterface(iCalculator);
        res1 = calc.mult(15, 7);  // 15 * 7
        res2 = calc.div(28, 5); // (28 / 5)
        res3 = calc.pow(res2, 2); // (28 / 5) ^ 2
        res4 = calc.sum(4.1, res1); // 4.1 + 15 * 7
        result = calc.sum(res4, res3);
        System.out.println(result);
        System.out.println(calc.getCountOperation() + "\n");

        System.out.println("CalculatorWithMathExtends");
        iCalculator = new CalculatorWithMathExtends();
        calc = new CalculatorWithCounterAutoCompositeInterface(iCalculator);
        res1 = calc.mult(15, 7);  // 15 * 7
        res2 = calc.div(28, 5); // (28 / 5)
        res3 = calc.pow(res2, 2); // (28 / 5) ^ 2
        res4 = calc.sum(4.1, res1); // 4.1 + 15 * 7
        result = calc.sum(res4, res3);
        System.out.println(result);
        System.out.println(calc.getCountOperation() + "\n");
    }
}
