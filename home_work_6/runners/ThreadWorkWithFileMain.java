package home_work_6.runners;

import home_work_6.api.ISearchEngine;
import home_work_6.runnable.SearchWordInTextWithLockAndLatch;
import home_work_6.utils.EasySearch;
import home_work_6.utils.ResultContainer;
import home_work_6.utils.TextFileToString;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadWorkWithFileMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        ISearchEngine engine = new EasySearch();
        ResultContainer container = new ResultContainer();
        Object lock = new Object();

        // выбор названия файла с книгами
        String directoryPath = choiceNameOfBookFile();

        File director = new File(directoryPath);
        File[] files = director.listFiles(file -> file.getName().endsWith(".txt"));

        // вывод списка книг в этом файле
        for (File listFile : files) {
            System.out.println(listFile.getName());
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long startTime = System.currentTimeMillis();
        CountDownLatch latch = new CountDownLatch(files.length);

        do {
            System.out.println("\nВыберите текст, который хотите найти в тексте: " +
                    "\n - Для выхода введите \'exit\'. ");
            String searchText = scanner.nextLine();
            if (searchText.equals("exit")) {
                break;
            } else {
                for (File file : files) {
                    String nameBook = file.getName();
                    String absolutePath = file.getAbsolutePath();
                    String textBook = textToString(absolutePath);
                    executorService.submit(new SearchWordInTextWithLockAndLatch(engine, textBook, nameBook, directoryPath,
                            searchText, container, lock, latch));
                }
                System.out.println("Результат: " + container.getResult());
                container.setResult(0);
            }
        } while (true);


        latch.await();
        executorService.shutdown();

        long finishTime = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (finishTime - startTime));

        // вывод файла result.txt с информацией о найденных словах
        String textResult = textToString("D:/Homework IT-Academy(Java)/src/home_work_6/books/threadResult.txt");
        System.out.println("\nВывод информации о найденных словах:");
        System.out.println(textResult);
    }


    /**
     * Метод, который переводит текст книги в строку
     *
     * @param nameBook - название файла с текстом книги
     * @return строку содержащую текст книги
     */
    public static String textToString(String nameBook) {
        TextFileToString textFileToString = new TextFileToString();
        return textFileToString.loadData(nameBook);
    }

    /**
     * Метод, для выбора названия файла с книгами
     * и проверка на правильность введённого названия файла
     *
     * @return название файла с книгами типа String
     */
    public static String choiceNameOfBookFile() {
        String directoryPath;
        File file;
        do {
            System.out.println("Введите имя файла с книгами:");
            directoryPath = scanner.nextLine();
//            directoryPath = "./src/home_work_6/books";
            file = new File(directoryPath);
            if (!file.exists()) {
                System.out.println("Неправильное имя файла !!!");
            }
        } while (!file.exists());
        return directoryPath;
    }
}
