package home_work_3.calcs.simple;

//2. Создать класс CalculatorWithOperator.
//        2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//        2.2 В классе должны присутствовать математические методы:
//        2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен принимать два параметра
//        (определитесь с их типами) и должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
//        2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
//        2.3 В методах можно использовать любые арифметические операторы.
//        2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой,
//        то для реализации метода "Квадратный корень из числа" можно воспользоваться библиотекой Math.
//        2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
//        В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
//        Вывести в консоль результат.


public class CalculatorWithOperator {

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
        double result = 1;
        if (num1 == 1.0 || num1 == 0.0) {
            return num1;
        } else {
            for (int i = 0; i < degree; i++) {
                result *= num1;
            }
        }
        return result;
    }

    /**
     * Метод вычисляет модуль числа
     * @param num - число
     * @return возвращает число по модулю
     */
    public double abs(double num) {
        return num > 0 ? num : -num;
    }

    /**
     * Метод вычисляет корень числа
     * @param num - число
     * @return возвращает квадратный корень числа
     */
    public double sqrt(double num) {
        double result = num;
        while (result * result > num) {
            result = (result + num / result) * 0.5;
        }
        return result;
    }

}
