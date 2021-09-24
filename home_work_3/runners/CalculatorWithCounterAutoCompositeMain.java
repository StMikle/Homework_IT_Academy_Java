package home_work_3.runners;

//1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {

        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        System.out.println("CalculatorWithOperator");
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite(calculatorWithOperator);
        double result;
        double res1 = calc.getCalculatorWithOperator().mult(15, 7);  // 15 * 7
        double res2 = calc.getCalculatorWithOperator().div(28, 5); // (28 / 5)
        double res3 = calc.getCalculatorWithOperator().pow(res2, 2); // (28 / 5) ^ 2
        double res4 = calc.getCalculatorWithOperator().sum(4.1, res1); // 4.1 + 15 * 7
        result = calc.getCalculatorWithOperator().sum(res4, res3);
        System.out.println(result);
        System.out.println(calc.getCountOperation() + "\n");

        System.out.println("CalculatorWithMathCopy");
        calc = new CalculatorWithCounterAutoComposite(calculatorWithMathCopy);
        res1 = calc.getCalculatorWithMathCopy().mult(15, 7);  // 15 * 7
        res2 = calc.getCalculatorWithMathCopy().div(28, 5); // (28 / 5)
        res3 = calc.getCalculatorWithMathCopy().pow(res2, 2); // (28 / 5) ^ 2
        res4 = calc.getCalculatorWithMathCopy().sum(4.1, res1); // 4.1 + 15 * 7
        result = calc.getCalculatorWithMathCopy().sum(res4, res3);
        System.out.println(result);
        System.out.println(calc.getCountOperation() + "\n");

        System.out.println("CalculatorWithMathExtends");
        calc = new CalculatorWithCounterAutoComposite(calculatorWithMathExtends);
        res1 = calc.getCalculatorWithMathExtends().mult(15, 7);  // 15 * 7
        res2 = calc.getCalculatorWithMathExtends().div(28, 5); // (28 / 5)
        res3 = calc.getCalculatorWithMathExtends().pow(res2, 2); // (28 / 5) ^ 2
        res4 = calc.getCalculatorWithMathExtends().sum(4.1, res1); // 4.1 + 15 * 7
        result = calc.getCalculatorWithMathExtends().sum(res4, res3);
        System.out.println(result);
        System.out.println(calc.getCountOperation());

    }
}
