package home_work_6.utils;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    /**
     * Реализация метода интерфейса, который ищет слово в обработанном тексте с помощью строки обработанной регулярным выражением
     * @param text текст в котором ищем
     * @param word слово, которое ищем
     * @return количество повторений слова
     */
    @Override
    public long search(String text, String word) {
        long count = 0;
        Pattern patternForWord = Pattern.compile(" " + word + " ");
        Matcher matcher = patternForWord.matcher(" " + text + " ");
        while (matcher.find()) {
            count++;
        }
        return count;
    }

}
