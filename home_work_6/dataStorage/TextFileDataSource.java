package home_work_6.dataStorage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileDataSource {
    public String loadData (String fileName) {
        /**
         * Метод для перевода текста из файла в строку
         *
         * @param fileName имя файла
         * @return строку
         */
        Path path = Path.of(fileName);
        String str = "";
        try {
            str = Files.readString(path);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом '" + fileName + "'.");
        }
        return str;
    }
}
