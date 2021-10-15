package home_work_4.dto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class DataContainer<T> implements Iterable<T> {

    /**
     * Поле дженерик типа T[]д
     */
    private T[] data;

    /**
     * Конструктор класса
     * @param data массив дженерик типа T[]
     */
    public DataContainer(T[] data) {
        if (data == null) {
            throw new IllegalArgumentException("Ошибка, надо передать массив");
        }
        this.data = Arrays.copyOf(data, data.length);
    }

    /**
     * Переопределение метода iterator()
     * @return интерфейс Iterator<T>
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < data.length;
            }

            @Override
            public T next() {
                return data[count++];
            }

            @Override
            public void remove() {
                delete(data[count]);
//                throw new UnsupportedOperationException("remove");
            }
        };
    }

    /**
     * Добавляет данные в хранилище,
     * переданный элемент сохраняется в конец хранилища
     * @param item элемент для сохранения
     * @return -1 - если данный элемент вставлять нельзя
     *          0 и больше - если элемент был вставлен,
     *          возвращаемое число обозначает индекс на который был вставлен элемент
     */
    public int add(T item) {
        if (!isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    return i;
                }
            }

            data = Arrays.copyOf(data, data.length + 1);
            int index = data.length - 1;
            data[index] = item;
            return index;
        }
    }

    /**
     * Данный метод возвращает данные хранимые в контейнере
     * @param index индекс элемента
     * @return null - если элемент не найден
     */
    public T get(int index) {
        if (isEmpty()) {
            return data[index];
        } else {
            return null;
        }
    }

    /**
     * Получить содержимое контейнера
     * @return копия контейнера
     */
    T[] getItems() {
        return Arrays.copyOf(data, data.length);
    }

    /**
     * Удалить элемент из контейнера по индексу
     * @param index индекс элемента
     * @return true - если удалили
     *          false - если не удалили
     */
    public boolean delete(int index) {
        if (!isEmpty()) {
            return false;
        }

        if (!isIndexOutOfBound(index)) {
            for (int i = index + 1; i < data.length; i++) {
                data[i - 1] = data[i];
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Удаляет первый найденный элемент в контейнере эквивалентный переданному
     * @param item переданный элемент
     * @return true - если удалили
     *          false - если не удалили
     */
    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], item)) {
                return delete(i);
            }
        }
        return false;
    }

    public void sort(Comparator<T> comparator) {
        sort(this, comparator);
    }

    // 11.*

    /**
     * Сортирует переданный контейнер
     * @param dataContainer переданный контейнер
     * @param <T> тип контейнера
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer) {
        Comparator<T> comparator = new Comparator<T>() {
            @Override
            public int compare(T t, T t1) {
                return t.compareTo(t1);
            }
        };

        sort(dataContainer, comparator);
    }

    //  12.*

    /**
     * Сортирует переданный контейнер
     * @param dataContainer переданный контейнер
     * @param comparator класс компаратор
     * @param <T> тип контейнера
     */
    public static <T> void sort(DataContainer<T> dataContainer, Comparator<T> comparator) {

        for (int i = 1; i < dataContainer.data.length; i++) {
            for (int j = dataContainer.data.length - 1; j >= i; j--) {
                if (comparator.compare(dataContainer.data[j - 1], dataContainer.data[j]) > 0) {
                    T temp = dataContainer.data[j - 1];
                    dataContainer.data[j - 1] = dataContainer.data[j];
                    dataContainer.data[j] = temp;
                }
            }
        }

    }

    /**
     * Переопределение метода toString()
     * @return строку со всеми полями класса, переданного в DataContainer
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("DataContainer: [");
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                str.append(data[i]);
                if (i < data.length - 1) {
                    str.append(", ");
                }
            }
        }
        return str + "]";
    }

    /**
     * Проверка на попадание индекса в размер контейнера
     * @param index индекс элемента
     * @return true - если не попал
     *          false - если попал
     */
    private boolean isIndexOutOfBound(int index) {
        return index >= data.length || index < 0;
    }

    /**
     * Проверка на пустоту контейнера
     * @return true - если контейнер не пустой
     *          false - если пустой
     */
    private boolean isEmpty() {
        return data != null;
    }
}
