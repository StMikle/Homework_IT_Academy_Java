package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

//1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        ICalculator iCalculator;

        System.out.println("CalculatorWithOperator");
        iCalculator = new CalculatorWithOperator();
        CalculatorWithMemory calc = new CalculatorWithMemory(iCalculator);
        calc.div(28, 5); // (28 / 5)
        calc.setResult();
        calc.pow(calc.getResult(), 2); // (28 / 5) ^ 2
        calc.setResult();
        calc.sum(calc.getResult(), 4.1); // ((28 / 5) ^ 2) + 4.1
        calc.setResult();
        calc.sum(calc.getResult(), calc.mult(15, 7)); // ((28 / 5) ^ 2 + 4.1) + 15 * 7
        calc.setResult();
        System.out.println(calc.getResult());
        System.out.println(calc.getCountOperation() + "\n");

        System.out.println("CalculatorWithMathCopy");
        iCalculator = new CalculatorWithMathCopy();
        calc = new CalculatorWithMemory(iCalculator);
        calc.div(28, 5); // (28 / 5)
        calc.setResult();
        calc.pow(calc.getResult(), 2); // (28 / 5) ^ 2
        calc.setResult();
        calc.sum(calc.getResult(), 4.1); // ((28 / 5) ^ 2) + 4.1
        calc.setResult();
        calc.sum(calc.getResult(), calc.mult(15, 7)); // ((28 / 5) ^ 2 + 4.1) + 15 * 7
        calc.setResult();
        System.out.println(calc.getResult());
        System.out.println(calc.getCountOperation() + "\n");

        System.out.println("CalculatorWithMathExtends");
        iCalculator = new CalculatorWithMathExtends();
        calc = new CalculatorWithMemory(iCalculator);
        calc.div(28, 5); // (28 / 5)
        calc.setResult();
        calc.pow(calc.getResult(), 2); // (28 / 5) ^ 2
        calc.setResult();
        calc.sum(calc.getResult(), 4.1); // ((28 / 5) ^ 2) + 4.1
        calc.setResult();
        calc.sum(calc.getResult(), calc.mult(15, 7)); // ((28 / 5) ^ 2 + 4.1) + 15 * 7
        calc.setResult();
        System.out.println(calc.getResult());
        System.out.println(calc.getCountOperation() + "\n");
    }
}
