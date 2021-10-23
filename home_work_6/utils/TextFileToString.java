package home_work_6.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileToString {
    public String loadData (String fileName) {
        /**
         * Метод для перевода текста из файла в строку
         *
         * @param fileName имя файла
         * @return строку
         */
        Path path = Path.of(fileName);
        String str = null;
        try {
            str = Files.readString(path);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом '" + fileName + "'.");
        }
        return str;
    }
}
