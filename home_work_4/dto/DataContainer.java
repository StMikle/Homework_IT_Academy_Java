package home_work_4.dto;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T>{
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {

        if (item == null) {
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

    public T get(int index) {
        try {
            return data[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    T[] getItems() {
        return data;
    }

    public boolean delete(int index) {

        if (data == null) {
            return false;
        } else if (index < data.length && index > -1) {
            for (int i = index + 1; i < data.length; i++) {
                T temp = data[i - 1];
                data[i - 1] = data[i];
                data[i] = temp;
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                return delete(i);
            }
        }
        return false;
    }

    public void sort(Comparator<T> comparator) {
        for (int i = 1; i < data.length; i++) {
            for (int j = data.length - 1; j >= i; j--) {
                if (comparator.compare(data[j - 1], data[j]) > 0) {
                    T temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

//    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer) {
//
//        for (int i = 1; i < dataContainer.data.length; i++) {
//            for (int j = dataContainer.data.length - 1; j >= i; j--) {
//                if (dataContainer.getItems()[j - 1].compareTo(dataContainer.getItems()[j])> 0) {
//                    T temp = dataContainer.getItems()[j - 1];
//                    dataContainer.getItems()[j - 1] = dataContainer.getItems()[j];
//                    dataContainer.getItems()[j] = temp;
//                }
//            }
//        }
//    }


//  12.*
    public static <T> void sort(DataContainer<T> dataContainer, Comparator<T> comparator) {

        for (int i = 1; i < dataContainer.data.length; i++) {
            for (int j = dataContainer.data.length - 1; j >= i; j--) {
                if (comparator.compare(dataContainer.getItems()[j - 1], dataContainer.getItems()[j]) > 0) {
                    T temp = dataContainer.getItems()[j - 1];
                    dataContainer.getItems()[j - 1] = dataContainer.getItems()[j];
                    dataContainer.getItems()[j] = temp;
                }
            }
        }

    }

    @Override
    public String toString() {
        String str = "data: [";
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                str += data[i];
                if (i < data.length - 1) {
                    str += ", ";
                }
            }
        }
        return str + "]";
    }
}
