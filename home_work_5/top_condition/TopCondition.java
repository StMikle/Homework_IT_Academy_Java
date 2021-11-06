package home_work_5.top_condition;

import home_work_5.top_condition.api.ITopCondition;

import java.util.List;

/**
 * Класс - дженерик, реализующий интерфейс ITopCondition<T>
 * @param <T> - класс с которым будет работать метод show()
 */
public class TopCondition<T> implements ITopCondition<T> {

    /**
     * Реализация метода интерфейса ITopCondition<T>,
     * который выводит заданное количество объектов класса T
     * @param list - переданная коллекция типа T
     * @param count - заданное количество объектов типа int
     */
    @Override
    public void show(List<T> list, int count) {
        for (T item : list) {
            System.out.println(item);
            count--;
            if (count <= 0) break;
        }
    }
}
