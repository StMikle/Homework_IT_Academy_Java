package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    private long countOperation;
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calc) {
        this.calculatorWithOperator = calc;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calc) {
        this.calculatorWithMathCopy = calc;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calc) {
        this.calculatorWithMathExtends = calc;
    }

    public CalculatorWithOperator getCalculatorWithOperator() {
        incrCountOperation();
        return calculatorWithOperator;
    }

    public CalculatorWithMathCopy getCalculatorWithMathCopy() {
        incrCountOperation();
        return calculatorWithMathCopy;
    }

    public CalculatorWithMathExtends getCalculatorWithMathExtends() {
        incrCountOperation();
        return calculatorWithMathExtends;
    }

    public void incrCountOperation () {
        this.countOperation++;
    }

    public long getCountOperation() {
        return this.countOperation;
    }
}
