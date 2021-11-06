package home_work_5.dataStorage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Утильный класс с методом loadData() для чтения имён из файла
 * и добавления их в коллекцию
 */
public class TextFileDataSource {

    /**
     * Метод, который заполняет лист именами из файла
     * @param filename - имя файла типа String
     * @param data - переменная типа List<String> хранящая ссылку на объект типа ArrayList<String>
     */
    public void loadData(String filename, List<String> data) {
            try (BufferedReader src = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = src.readLine()) != null) {
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл '" + filename + "' не найден.");
        } catch (IOException e) { //для исключений метода readline и при закрытии ресурса
            System.out.println("Ошибка при работе с файлом '" + filename + "'.");
        }
    }
}

