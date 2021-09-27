package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    /**
     * поле для подсчёта количества операций
     */
    private long countOperation;
    private double result;
    private double tempResult;

    public double getResult() {
        double res = this.tempResult;
        this.tempResult = 0;
        this.result = 0;

        return res;
    }

    public void setResult() {
        this.tempResult = this.result;
    }

    /**
     * поле типа ICalculator
     */
    private final ICalculator iCalculator;

    /**
     * Конструктор принимающий переменную типа ICalculator
     * @param iCalculator - переменная типа ICalculator
     */
    public CalculatorWithMemory(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
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

    public double div(double numerator, double denominator) {
        incrCountOperation();
        this.result = iCalculator.div(numerator, denominator);
        return this.result;
    }

    public double mult(double num1, double num2) {
        incrCountOperation();
        this.result = iCalculator.mult(num1, num2);
        return this.result;
    }

    public double sqrt(double num) {
        incrCountOperation();
        this.result = iCalculator.sqrt(num);
        return result;
    }

    public double abs(double num) {
        incrCountOperation();
        this.result = iCalculator.abs(num);
        return this.result;
    }

    public double pow(double num1, int degree) {
        incrCountOperation();
        this.result = iCalculator.pow(num1, degree);
        return this.result;
    }

    public double sub(double num1, double num2) {
        incrCountOperation();
        this.result = iCalculator.sub(num1, num2);
        return this.result;
    }

    public double sum(double num1, double num2) {
        incrCountOperation();
        this.result = iCalculator.sum(num1, num2);
        return this.result;
    }
}
