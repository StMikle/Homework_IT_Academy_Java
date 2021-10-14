package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface {

    /**
     * поле типа long для подсчёта количества операций
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
     * Метод, который увеличивает значение поля countOperation
     */
    private void incrCountOperation () {
        this.countOperation++;
    }

    /**
     * Метод (getter)
     * @return возвращает значение поля countOperation
     */
    public long getCountOperation() {
        return this.countOperation;
    }

    /**
     * Метод, который возвращает результат выполнения метода div() класса Калькулятора переданного в конструктор
     * Вызов метода по увеличению поля countOperation
     * @param numerator - числитель типа double
     * @param denominator - знаменатель типа double
     * @return возвращает результат от деления типа double
     */
    public double div(double numerator, double denominator) {
        incrCountOperation();
        return iCalculator.div(numerator, denominator);
    }

    /**
     * Метод, который возвращает результат выполнения метода mult() класса Калькулятора переданного в конструктор
     * Вызов метода по увеличению поля countOperation
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от умножения типа double
     */
    public double mult(double num1, double num2) {
        incrCountOperation();
        return iCalculator.mult(num1, num2);
    }

    /**
     * Метод, который возвращает результат выполнения метода sqrt() класса Калькулятора переданного в конструктор
     * Вызов метода по увеличению поля countOperation
     * @param num число
     * @return возвращает квадратный корень числа типа double
     */
    public double sqrt(double num) {
        incrCountOperation();
        return iCalculator.sqrt(num);
    }

    /**
     * Метод, который возвращает результат выполнения метода abs() класса Калькулятора переданного в конструктор
     * Вызов метода по увеличению поля countOperation
     * @param num - число
     * @return возвращает число по модулю типа double
     */
    public double abs(double num) {
        incrCountOperation();
        return iCalculator.abs(num);
    }

    /**
     * Метод, который возвращает результат выполнения метода pow() класса Калькулятора переданного в конструктор
     * Вызов метода по увеличению поля countOperation
     * @param num1 - число
     * @param degree - степень
     * @return возвращает число возведённое в степень типа double
     */
    public double pow(double num1, int degree) {
        incrCountOperation();
        return iCalculator.pow(num1, degree);
    }

    /**
     * Метод, который возвращает результат выполнения метода sub() класса Калькулятора переданного в конструктор
     * Вызов метода по увеличению поля countOperation
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от вычитания типа double
     */
    public double sub(double num1, double num2) {
        incrCountOperation();
        return iCalculator.sub(num1, num2);
    }

    /**
     * Метод, который возвращает результат выполнения метода sum() класса Калькулятора переданного в конструктор
     * Вызов метода по увеличению поля countOperation
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от сложения типа double
     */
    public double sum(double num1, double num2) {
        incrCountOperation();
        return iCalculator.sum(num1, num2);
    }

}
