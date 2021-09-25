package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    /**
     * поле для подсчёта количества операций
     */
    private long countOperation;

    /**
     *
     */
    private CalculatorWithOperator calculatorWithOperator;

    /**
     *
     */
    private CalculatorWithMathCopy calculatorWithMathCopy;
    /**
     *
     */
    private CalculatorWithMathExtends calculatorWithMathExtends;

    /**
     *
     * @param calc
     */
    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calc) {
        this.calculatorWithOperator = calc;
    }

    /**
     *
     * @param calc
     */
    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calc) {
        this.calculatorWithMathCopy = calc;
    }

    /**
     *
     * @param calc
     */
    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calc) {
        this.calculatorWithMathExtends = calc;
    }

    public double div(double numerator, double denominator) {
        incrCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.div(numerator, denominator);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.div(numerator, denominator);
        } else {
            return calculatorWithMathExtends.div(numerator, denominator);
        }
    }

    public double mult(double num1, double num2) {
        incrCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.mult(num1, num2);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.mult(num1, num2);
        } else {
            return calculatorWithMathExtends.mult(num1, num2);
        }
    }

    public double sqrt(double num) {
        incrCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.sqrt(num);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sqrt(num);
        } else {
            return calculatorWithMathExtends.sqrt(num);
        }
    }

    public double abs(double num) {
        incrCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.abs(num);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.abs(num);
        } else {
            return calculatorWithMathExtends.abs(num);
        }
    }

    public double pow(double num1, int degree) {
        incrCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.pow(num1, degree);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.pow(num1, degree);
        } else {
            return calculatorWithMathExtends.pow(num1, degree);
        }
    }

    public double sub(double num1, double num2) {
        incrCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.sub(num1, num2);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sub(num1, num2);
        } else {
            return calculatorWithMathExtends.sub(num1, num2);
        }
    }

    public double sum(double num1, double num2) {
        incrCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.sum(num1, num2);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sum(num1, num2);
        } else {
            return calculatorWithMathExtends.sum(num1, num2);
        }
    }

    /**
     * Метод, который увеличивает значение поля countOperation
     */
    public void incrCountOperation () {
        this.countOperation++;
    }

    /**
     * Метод (getter)
     * @return возвращает значение поля countOperation
     */
    public long getCountOperation() {
        return this.countOperation;
    }
}
