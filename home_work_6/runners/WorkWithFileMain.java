package home_work_6.runners;

import home_work_6.api.ISearchEngine;
import home_work_6.decorators.SearchEnginePunctuationNormalizer;
import home_work_6.utils.RegExSearch;
import home_work_6.utils.TextFileToString;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WorkWithFileMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // выбор названия файла с книгами
        String nameFile = choiceNameOfBookFile();
        // вывод списка книг в этом файле
        outNameOfBooks(nameFile);

        // выбор названия книги с которой будем работать
        String nameBook = choiceNameBook(nameFile);

        // перевод текста из файла в строку
        String textBook = textToString(nameFile, nameBook);
        // вывод текста из файла
        System.out.println(textBook);

        // поиск текста в книге
        searchText(nameFile, nameBook, textBook);

        // вывод файла result.txt с информацией о найденных словах
        String textResult = textToString(nameFile, "result.txt");
        System.out.println("\nВывод информации о найденных словах:");
        System.out.println(textResult);
    }

    /**
     * Метод, для записи в файл result.txt результаты поиска слов в книгах
     * @param nameFile - название файла с книгами
     * @param text - текст, который будем записывать в файл
     */
    public static void writeToFile(String nameFile, String text) {
        try (FileWriter fileWriter = new FileWriter(nameFile + "//result.txt", true)){
            fileWriter.write(text);
            fileWriter.append('\n');
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом" + e);;
        }
    }

    /**
     * Метод, для выбора названия файла с книгами
     * и проверка на правильность введённого названия файла
     * @return название файла с книгами типа String
     */
    public static String choiceNameOfBookFile() {
        String nameFile;
        File file;
        do {
            System.out.println("Введите имя файла с книгами:");
            nameFile = scanner.nextLine();
            file = new File(nameFile);
            if (!file.exists()) {
                System.out.println("Неправильное имя файла !!!");
            }
        } while (!file.exists());
        return nameFile;
    }

    /**
     * Метод, для выбора названия файла с текстом книги
     * и проверка на правильность введённого названия файла
     *
     * @param nameFile - название файла с книгами
     * @return название файла с текстом книги типа String
     */
    public static String choiceNameBook(String nameFile) {
        String nameBook;
        File file;
        do {
            System.out.print("\nВыберите имя книги, с которой вы хотите работать: ");
            nameBook = scanner.nextLine();
            file = new File(nameFile + "//" + nameBook);
            if (!file.exists()) {
                System.out.println("Неправильное имя файла !!!");
            }
        } while (!file.exists());
        return nameBook;
    }

    /**
     * Метод, который переводит текст книги в строку
     * @param nameFile - название файла с книгами
     * @param nameBook - название файла с текстом книги
     * @return строку содержащую текст книги
     */
    public static String textToString(String nameFile, String nameBook) {
        TextFileToString textFileToString = new TextFileToString();
        return textFileToString.loadData(nameFile + "//" + nameBook);
    }

    /**
     * Метод, который выводит список файлов с книгами
     * @param nameFile - название файла с книгами
     */
    public static void outNameOfBooks(String nameFile) {
        File dir = new File(nameFile);
        File[] arrFiles = dir.listFiles();
        List<File> listFiles = Arrays.asList(arrFiles);
        for (File listFile : listFiles) {
            System.out.println(listFile.getName());
        }
    }

    /**
     * Метод, который ищет нужный пользователю текст в книге, пока не надоест
     * @param nameFile - название файла с книгами
     * @param nameBook - название файла с текстом книги
     * @param textBook - текст книги
     */
    public static void searchText(String nameFile, String nameBook, String textBook) {
        String searchText;
        do {
            System.out.print("\nВыберите текст, который хотите найти в тексте." +
                    "\n - Для выхода введите \'exit\'. " +
                    "\n - Для того, чтобы выбрать новый файл, введите \'new file\'" +
                    "\nТекст: ");
            searchText = scanner.nextLine();
            if (searchText.equals("exit")) {
                break;
            } else if (searchText.equals("new file")) {
                outNameOfBooks(nameFile);
                nameBook = choiceNameBook(nameFile);
                textBook = textToString(nameFile, nameBook);
                System.out.println(textBook);
                continue;
            }
            ISearchEngine iSearchEngine = new SearchEnginePunctuationNormalizer(new RegExSearch());
            long count = iSearchEngine.search(textBook, searchText);
            String text = "Имя файла: " + nameBook + "  |  Текст: " + searchText + "  |  Количество раз: " + count;
            writeToFile(nameFile, text);
        } while (true);
    }
}
