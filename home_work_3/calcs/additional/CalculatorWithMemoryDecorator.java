package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {

    private ICalculator iCalculator;
    private double result;
    private double tempResult;

    public CalculatorWithMemoryDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public ICalculator getCalculator() {
        return this.iCalculator;
    }

    public double getResult() {
        double res = this.tempResult;
        this.tempResult = 0;
        this.result = 0;

        return res;
    }

    public void setResult() {
        this.tempResult = this.result;
    }

    public double div(double numerator, double denominator) {
        this.result = iCalculator.div(numerator, denominator);
        return this.result;
    }

    public double mult(double num1, double num2) {
        this.result = iCalculator.mult(num1, num2);
        return this.result;
    }

    public double sqrt(double num) {
        this.result = iCalculator.sqrt(num);
        return result;
    }

    public double abs(double num) {
        this.result = iCalculator.abs(num);
        return this.result;
    }

    public double pow(double num1, int degree) {
        this.result = iCalculator.pow(num1, degree);
        return this.result;
    }

    public double sub(double num1, double num2) {
        this.result = iCalculator.sub(num1, num2);
        return this.result;
    }

    public double sum(double num1, double num2) {
        this.result = iCalculator.sum(num1, num2);
        return this.result;
    }
}
