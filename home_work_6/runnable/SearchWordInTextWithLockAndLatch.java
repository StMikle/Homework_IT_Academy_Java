package home_work_6.runnable;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.ResultContainer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class SearchWordInTextWithLockAndLatch implements Runnable {

    /**
     * Поле типа CountDownLatch
     */
    private final CountDownLatch latch;

    /**
     * Поле типа ISearchEngine
     */
    private final ISearchEngine engine;

    /**
     * Поле типа String для хранения текста книги
     */
    private final String text;

    /**
     * Поле типа String для хранения слова
     */
    private final String word;

    /**
     * Поле типа ResultContainer
     */
    private final ResultContainer container;

    /**
     * Поле типа Object (объект-заглушка)
     */
    private final Object lock;

    /**
     * Поле типа String для хранения названия книги
     */
    private final String nameBook;

    /**
     * Поле типа String для хранения адреса папки с книгами
     */
    private final String directoryPath;

    /**
     * Стандартный конструктор для присвоения полям класса значений
     * @param engine - переменная типа ISearchEngine
     * @param text - переменная типа String содержащая текст книги
     * @param nameBook - переменная типа String содержащая название книги
     * @param directoryPath - переменная типа String содержащая адреса папки с книгами
     * @param word - переменная типа String содержащая слово, которое будем искать
     * @param container - переменная типа ResultContainer
     * @param lock - переменная типа Object
     * @param latch - переменная типа CountDownLatch
     */
    public SearchWordInTextWithLockAndLatch(ISearchEngine engine, String text, String nameBook,
                                            String directoryPath, String word, ResultContainer container,
                                            Object lock, CountDownLatch latch) {
        this.engine = engine;
        this.text = text;
        this.word = word;
        this.container = container;
        this.lock = lock;
        this.latch = latch;
        this.nameBook = nameBook;
        this.directoryPath = directoryPath;

    }

    /**
     * Метод, для записи в файл result.txt результаты поиска слов в книгах
     * @param nameFile - название файла с книгами
     * @param text - текст, который будем записывать в файл
     */
    public static void writeToFile(String nameFile, String text) {
        try (FileWriter fileWriter = new FileWriter(nameFile + "//threadResult.txt", true)){
            fileWriter.write(text);
            fileWriter.append('\n');
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом" + e);;
        }
    }

    /**
     * Реализация метода класса Runnable, в котором идёт поиск слова word
     * в тексте text, запись в файл информации о найденных словах и
     * синхронизированная запись количества найденных слов
     */
    @Override
    public void run() {
        long temp = engine.search(text, word);
        synchronized (lock) {
            int result = container.getResult();
            result += temp;
            container.setResult(result);
            String text = "Имя файла: " + nameBook + "  |  Текст: " + word + "  |  Количество раз: " + temp;
            writeToFile(directoryPath, text);
        }
        latch.countDown();
    }
}
