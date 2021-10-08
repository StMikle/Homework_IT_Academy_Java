package home_work_5.dataStorage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TextFileDataSource {
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

