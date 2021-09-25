package home_work_3.calcs.api;

public interface ICalculator {
    double div(double numerator, double denominator);
    double mult(double num1, double num2);
    double sum(double num1, double num2);
    double sub(double num1, double num2);
    double pow(double num1, int degree);
    double abs(double num);
    double sqrt(double num);
}
