package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

//1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.

public class CalculatorDecoratorMain {
    public static void main(String[] args) {

        System.out.println("CalculatorWithMathExtends");
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithMemoryDecorator calculatorWithMemoryDecorator = new CalculatorWithMemoryDecorator(calculatorWithMathExtends);
        ICalculator iCalculator = new CalculatorWithCounterAutoDecorator(calculatorWithMemoryDecorator);

        double result;
        double res1 = iCalculator.mult(15, 7);  // 15 * 7
        double res2 = iCalculator.div(28, 5); // (28 / 5)
        double res3 = iCalculator.pow(res2, 2); // (28 / 5) ^ 2
        double res4 = iCalculator.sum(4.1, res1); // 4.1 + 15 * 7
        result = iCalculator.sum(res4, res3);

        if (iCalculator instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator calculatorWithCounterAutoDecorator = (CalculatorWithCounterAutoDecorator) iCalculator;
            System.out.println("Количество операций: " + calculatorWithCounterAutoDecorator.getCountOperation());
            iCalculator = calculatorWithCounterAutoDecorator.getCalculator();
        }
        if (iCalculator instanceof CalculatorWithMemoryDecorator) {
            calculatorWithMemoryDecorator.setResult();
            System.out.println("Последняя операция: " + calculatorWithMemoryDecorator.getResult());
        }
        System.out.println("Ответ: " + result);
    }
}
