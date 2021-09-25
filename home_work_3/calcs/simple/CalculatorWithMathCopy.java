package home_work_3.calcs.simple;

//3. Создать класс CalculatorWithMathCopy.
//        3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//        3.2 В классе должны присутствовать математические методы:
//        3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//        Скопировать базовые математические операции из CalculatorWithOperator.
//        3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//        Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
//        3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод).
//        В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
//        Вывести в консоль результат.

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    /**
     * Метод делит одно число на другое и проверяет на деление на ноль
     * @param numerator - числитель типа double
     * @param denominator - знаменатель типа double
     * @return возвращает результат от деления типа double
     */
    public double div(double numerator, double denominator) {
        double result = 0;
        try {
            result = numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println(e + "Деление на ноль!!!");
        }
        return result;
    }

    /**
     * Метод умножает одно число на другое
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от умножения типа double
     */
    public double mult(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Метод складывает два числа
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от сложения типа double
     */
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Метод вычитает из одного числа другое
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от вычитания типа double
     */
    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Метод возводит число в степень
     * @param num1 - число
     * @param degree - степень
     * @return возвращает число возведённое в степень
     */
    public double pow(double num1, int degree) {
        return Math.pow(num1, degree);
    }

    /**
     * Метод вычисляет модуль числа
     * @param num - число
     * @return возвращает число по модулю
     */
    public double abs(double num) {
        return Math.abs(num);
    }

    /**
     * Метод вычисляет корень числа
     * @param num - число
     * @return возвращает квадратный корень числа
     */
    public double sqrt(double num) {
        return Math.sqrt(num);
    }
}
