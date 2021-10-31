package home_work_6.runners;

import home_work_6.api.ISearchEngine;
import home_work_6.decorators.SearchEnginePunctuationNormalizer;
import home_work_6.utils.RegExSearch;
import home_work_6.utils.TextFileToString;

import java.io.*;
import java.util.Scanner;

public class WorkWithFileMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // выбор пути к файлу с книгами
        File directory = choiceDirectoryPathOfBookFile();
        // вывод списка книг в этом файле
        outNameOfBooks(directory);

        // выбор названия книги с которой будем работать
        String nameBook = choiceNameBook(directory);

        // перевод текста из файла в строку
        String textBook = textToString(directory, nameBook);
        // вывод текста из файла
        System.out.println(textBook);

        // поиск текста в книге
        searchText(directory, nameBook, textBook);

        // вывод файла result.txt с информацией о найденных словах
        String textResult = textToString(directory, "result.txt");
        System.out.println("\nВывод информации о найденных словах:");
        System.out.println(textResult);
    }

    /**
     * Метод, для записи в файл result.txt результаты поиска слов в книгах
     * @param directory - объект типа File c книгами
     * @param text - текст, который будем записывать в файл
     */
    public static void writeToFile(File directory, String text) {
        try (FileWriter fileWriter = new FileWriter(directory + "//result.txt", true)){
            fileWriter.write(text);
            fileWriter.append('\n');
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом" + e);;
        }
    }

    /**
     * Метод, для задания пути к файлу с книгами
     * и проверка на правильность введённого названия пути к этому файлу
     * @return название пути к файлу с книгами типа String
     */
    public static File choiceDirectoryPathOfBookFile() {
        String nameFile;
        File file;
        do {
            System.out.println("Введите путь к файлу с книгами:");
            nameFile = scanner.nextLine();
            file = new File(nameFile);
            if (!file.exists()) {
                System.out.println("Неправильное путь к файлу!!!");
            }
        } while (!file.exists());
        return file;
    }

    /**
     * Метод, для выбора названия файла с текстом книги
     * и проверка на правильность введённого названия файла
     *
     * @param directory - объект типа File c книгами
     * @return название файла с текстом книги типа String
     */
    public static String choiceNameBook(File directory) {
        String nameBook;
        File file;
        do {
            System.out.print("\nВыберите имя книги, с которой вы хотите работать: ");
            nameBook = scanner.nextLine();
            file = new File(directory + "//" + nameBook);
            if (!file.exists()) {
                System.out.println("Неправильное имя файла !!!");
            }
        } while (!file.exists());
        return nameBook;
    }

    /**
     * Метод, который переводит текст книги в строку
     * @param directory - объект типа File c книгами
     * @param nameBook - название файла с текстом книги
     * @return строку содержащую текст книги
     */
    public static String textToString(File directory, String nameBook) {
        TextFileToString textFileToString = new TextFileToString();
        return textFileToString.loadData(directory + "//" + nameBook);
    }

    /**
     * Метод, который выводит список файлов с книгами
     * @param directory - объект типа File c книгами
     */
    public static void outNameOfBooks(File directory) {
        File[] arrFiles = directory.listFiles();
        for (File arrFile : arrFiles) {
            System.out.println(arrFile.getName());
        }
    }

    /**
     * Метод, который ищет нужный пользователю текст в книге, пока не надоест
     * @param directory - объект типа File c книгами
     * @param nameBook - название файла с текстом книги
     * @param textBook - текст книги
     */
    public static void searchText(File directory, String nameBook, String textBook) {
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
                outNameOfBooks(directory);
                nameBook = choiceNameBook(directory);
                textBook = textToString(directory, nameBook);
                System.out.println(textBook);
                continue;
            }
            ISearchEngine iSearchEngine = new SearchEnginePunctuationNormalizer(new RegExSearch());
            long count = iSearchEngine.search(textBook, searchText);
            String text = "Имя файла: " + nameBook + "  |  Текст: " + searchText + "  |  Количество раз: " + count;
            writeToFile(directory, text);
        } while (true);
    }
}
