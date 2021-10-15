package home_work_3.calcs.api;

public interface ICalculator {
    /**
     * Объявление метода, который должен делить одно число на другое
     * @param numerator - числитель типа double
     * @param denominator - знаменатель типа double
     * @return возвращает результат от деления типа double
     */
    double div(double numerator, double denominator);

    /**
     * Объявление метода, который должен умножать одно число на другое
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от умножения типа double
     */
    double mult(double num1, double num2);

    /**
     * Объявление метода, который должен складывать два числа
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от сложения типа double
     */
    double sum(double num1, double num2);

    /**
     * Объявление метода, который должен вычитать из одного числа другое
     * @param num1 - первое число типа double
     * @param num2 - второе число типа double
     * @return возвращает результат от вычитания типа double
     */
    double sub(double num1, double num2);

    /**
     * Объявление метода, который должен возводить число в степень
     * @param num1 - число
     * @param degree - степень
     * @return возвращает число возведённое в степень
     */
    double pow(double num1, int degree);

    /**
     * Объявление метода, который должен вычислять модуль числа
     * @param num - число
     * @return возвращает число по модулю
     */
    double abs(double num);

    /**
     * Объявление метода, который должен вычислять корень числа
     * @param num - число
     * @return возвращает квадратный корень числа
     */
    double sqrt(double num);
}
