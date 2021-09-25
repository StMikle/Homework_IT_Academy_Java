package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface {

    /**
     * поле для подсчёта количества операций
     */
    private long countOperation;

    /**
     * поле типа ICalculator
     */
    private final ICalculator iCalculator;

    /**
     * Конструктор принимающий переменную типа ICalculator
     * @param iCalculator - переменная типа ICalculator
     */
    public CalculatorWithCounterAutoCompositeInterface(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    /**
     * Метод для возврата переменной типа ICalculator (getter)
     * Вызов метода по увеличению поля countOperation
     * @return возвращает переменную типа ICalculator
     */

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
        return iCalculator.div(numerator, denominator);
    }

    public double mult(double num1, double num2) {
        incrCountOperation();
        return iCalculator.mult(num1, num2);
    }

    public double sqrt(double num) {
        incrCountOperation();
        return iCalculator.sqrt(num);
    }

    public double abs(double num) {
        incrCountOperation();
        return iCalculator.abs(num);
    }

    public double pow(double num1, int degree) {
        incrCountOperation();
        return iCalculator.pow(num1, degree);
    }

    public double sub(double num1, double num2) {
        incrCountOperation();
        return iCalculator.sub(num1, num2);
    }

    public double sum(double num1, double num2) {
        incrCountOperation();
        return iCalculator.sum(num1, num2);
    }

}
