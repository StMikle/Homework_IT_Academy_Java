package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    /**
     * поле для подсчёта количества операций
     */
    private long countOperation;

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

    /**
     * Переопределение метода abs()
     * Вызов метода по увеличению поля countOperation
     * @param num - число
     * @return возвращает число по модулю
     */
    @Override
    public double abs(double num) {
        incrCountOperation();
        return super.abs(num);
    }

    /**
     * Переопределение метода sqrt()
     * Вызов метода по увеличению поля countOperation
     * @param num число
     * @return возвращает квадратный корень числа
     */
    @Override
    public double sqrt(double num) {
        incrCountOperation();
        return super.sqrt(num);
    }

    /**
     * Переопределение метода pow()
     * Вызов метода по увеличению поля countOperation
     * @param num1 - число
     * @param degree - степень
     * @return возвращает число возведённое в степень
     */
    @Override
    public double pow(double num1, int degree) {
        incrCountOperation();
        return super.pow(num1, degree);
    }

    /**
     * Переопределение метода div()
     * Вызов метода по увеличению поля countOperation
     * @param numerator - числитель типа double
     * @param denominator - знаменатель типа double
     * @return возвращает результат от деления типа double
     */
    @Override
    public double div(double numerator, double denominator) {
        incrCountOperation();
        return super.div(numerator, denominator);
    }

    /**
     * Переопределение метода mult()
     * Вызов метода по увеличению поля countOperation
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от умножения типа double
     */
    @Override
    public double mult(double num1, double num2) {
        incrCountOperation();
        return super.mult(num1, num2);
    }

    /**
     * Переопределение метода sum()
     * Вызов метода по увеличению поля countOperation
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от сложения типа double
     */
    @Override
    public double sum(double num1, double num2) {
        incrCountOperation();
        return super.sum(num1, num2);
    }

    /**
     * Переопределение метода sub()
     * Вызов метода по увеличению поля countOperation
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от вычитания типа double
     */
    @Override
    public double sub(double num1, double num2) {
        incrCountOperation();
        return super.sub(num1, num2);
    }

}