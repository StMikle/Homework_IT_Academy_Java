package home_work_5.top_condition.api;

import java.util.List;

/**
 * Интерфейс, который объявляет метод для вывода
 * определённого количества объектов в коллекции
 * @param <T> - класс с которым будет работать метод show()
 */
public interface ITopCondition<T> {
    void show(List<T> list, int count);
}
