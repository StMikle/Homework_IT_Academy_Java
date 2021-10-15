package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {

    /**
     * поле типа ICalculator
     */
    private final ICalculator iCalculator;

    /**
     * Поле типа double для хранения результата операций
     */
    private double result;

    /**
     * Поле типа double для хранения промежуточного результата операций
     */
    private double tempResult;

    /**
     * Конструктор принимающий переменную типа ICalculator
     * @param iCalculator - переменная типа ICalculator
     */
    public CalculatorWithMemoryDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    /**
     * Метод (getter), который возвращает поле iCalculator
     * @return поле iCalculator типа ICalculator
     */
    public ICalculator getCalculator() {
        return this.iCalculator;
    }

    /**
     * Метод (getter), который возвращает результат последнего выполнения метода математической операции из класса
     * @return результат последнего выполнения метода математической операции из класса типа double
     */
    public double getResult() {
        double res = this.tempResult;
        this.tempResult = 0;
        this.result = 0;

        return res;
    }

    /**
     * Метод (setter), который записывает в поле tempResult
     * результат последнего выполнения метода математической операции из класса
     */
    public void setResult() {
        this.tempResult = this.result;
    }

    /**
     * Метод, который присваивает результат выполнения метода div()
     * класса Калькулятора переданного в конструктор полю result и возвращает значение этого поля
     * @param numerator - числитель типа double
     * @param denominator - знаменатель типа double
     * @return возвращает результат от деления типа double
     */
    public double div(double numerator, double denominator) {
        this.result = iCalculator.div(numerator, denominator);
        return this.result;
    }

    /**
     * Метод, который присваивает результат выполнения метода mult()
     * класса Калькулятора переданного в конструктор полю result и возвращает значение этого поля
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от умножения типа double
     */
    public double mult(double num1, double num2) {
        this.result = iCalculator.mult(num1, num2);
        return this.result;
    }

    /**
     * Метод, который присваивает результат выполнения метода sqrt()
     * класса Калькулятора переданного в конструктор полю result и возвращает значение этого поля
     * @param num число
     * @return возвращает квадратный корень числа типа double
     */
    public double sqrt(double num) {
        this.result = iCalculator.sqrt(num);
        return result;
    }

    /**
     * Метод, который присваивает результат выполнения метода abs()
     * класса Калькулятора переданного в конструктор полю result и возвращает значение этого поля
     * @param num - число
     * @return возвращает число по модулю типа double
     */
    public double abs(double num) {
        this.result = iCalculator.abs(num);
        return this.result;
    }

    /**
     * Метод, который присваивает результат выполнения метода pow()
     * класса Калькулятора переданного в конструктор полю result и возвращает значение этого поля
     * @param num1 - число
     * @param degree - степень
     * @return возвращает число возведённое в степень типа double
     */
    public double pow(double num1, int degree) {
        this.result = iCalculator.pow(num1, degree);
        return this.result;
    }

    /**
     * Метод, который присваивает результат выполнения метода sub()
     * класса Калькулятора переданного в конструктор полю result и возвращает значение этого поля
     * Вызов метода по увеличению поля countOperation
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от вычитания типа double
     */
    public double sub(double num1, double num2) {
        this.result = iCalculator.sub(num1, num2);
        return this.result;
    }

    /**
     * Метод, который присваивает результат выполнения метода sum()
     * класса Калькулятора переданного в конструктор полю result и возвращает значение этого поля
     * Вызов метода по увеличению поля countOperation
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от сложения типа double
     */
    public double sum(double num1, double num2) {
        this.result = iCalculator.sum(num1, num2);
        return this.result;
    }
}
