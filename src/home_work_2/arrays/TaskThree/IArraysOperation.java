package home_work_2.arrays.TaskThree;

public interface IArraysOperation {  // Методы объявленные в интерфейсе являются абстрактными (должны быть реализованы в классе),
    void output(int[] arr);          // а так же, методы, объявленные в интерфейсе, неявно считаются открытыми (public)
    void outEverySecond(int[] arr);
    void outInReverse(int[] arr);
}
