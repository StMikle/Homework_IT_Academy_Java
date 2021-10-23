package home_work_6.runners;

import home_work_6.api.ISearchEngine;
import home_work_6.decorators.SearchEnginePunctuationNormalizer;
import home_work_6.utils.RegExSearch;
import home_work_6.utils.TextFileToString;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WorkWithFileMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean chek;
        String nameFile = null;
        do {
            try {
                nameFile = choiceNameOfBookFile();
                outNameOfBooks(nameFile);
                chek = false;
            } catch (NullPointerException n) {
                System.out.println("Ошибка при работе с файлом '" + nameFile + "'.");
                chek = true;
            }
        } while (chek);

        String nameBook = choiceNameBook(nameFile);

        String textBook;
        do {
            textBook = textToString(nameFile, nameBook);
        } while (textBook == null);
        System.out.println(textBook);

        searchText(nameFile, nameBook, textBook);
    }

    public static String choiceNameOfBookFile() {
        System.out.println("Введите имя файла с книгами:");
        return scanner.nextLine();
    }

    public static String choiceNameBook(String nameFile) {
        String nameBook;
        File file;
        do {
            System.out.print("\nВыберите имя книги, с которой вы хотите работать: ");
            nameBook = scanner.nextLine();
            file = new File(nameFile + "//" + nameBook);
        } while (!file.exists());
        return nameBook;
    }

    public static String textToString(String nameFile, String nameBook) {
        TextFileToString textFileToString = new TextFileToString();
        return textFileToString.loadData(nameFile + "//" + nameBook);
    }

    public static void outNameOfBooks(String nameFile) throws NullPointerException {
        File dir = new File(nameFile);
        File[] arrFiles = dir.listFiles();
        List<File> listFiles = Arrays.asList(arrFiles);
        for (File listFile : listFiles) {
            System.out.println(listFile.getName());
        }
    }

    public static void searchText(String nameFile, String nameBook, String textBook) {
        String searchText = "";
        do {
            System.out.print("\nВыберите текст, который хотите найти в тексте." +
                    "\nДля выхода введите \'exit\'. " +
                    "\nДля того, чтобы выбрать новый файл, введите \'new file\'" +
                    "\nТекст: ");
            searchText = scanner.nextLine();
            if (searchText.equals("exit")) {
                break;
            } else if (searchText.equals("new file")) {
                outNameOfBooks(nameFile);
                nameBook = choiceNameBook(nameFile);
                do {
                    textBook = textToString(nameFile, nameBook);
                } while (textBook == null);
                continue;
            }
            ISearchEngine iSearchEngine = new SearchEnginePunctuationNormalizer(new RegExSearch());
            long count = iSearchEngine.search(textBook, searchText);
            System.out.println("Имя файла: " + nameBook + ".txt" + "  |  Текст: " + searchText + "  |  Количество раз: " + count);
        } while (true);
    }
}
