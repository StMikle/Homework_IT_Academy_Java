package home_work_6.decorators;

import home_work_6.utils.RegExSearch;
import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    /**
     * поле типа ISearchEngine
     */
    private final ISearchEngine iSearchEngine;

    /**
     * Конструктор принимающий переменную типа ISearchEngine
     * @param iSearchEngine - переменная типа ISearchEngine
     */
    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    /**
     * Метод, который присваивает результат выполнения метода search()
     * класса Search переданного в конструктор
     * @param text - переданный текст
     * @param word - слово, которое ищем
     * @return количество найденных слов типа long
     */
    @Override
    public long search(String text, String word) {
        if (iSearchEngine instanceof RegExSearch) {
            text = replacePunctuationChars(text);
        }
        return this.iSearchEngine.search(text, word);
    }

    /**
     * Метод, который заменяет все символы-разделители и нежелательные символы в тексте двумя пробелами
     * @param text текст, который обрабатываем
     * @return обработанный текст
     */
    public String replacePunctuationChars(String text) {
        String chars = "(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)";
        return text.replaceAll(chars, "  ").replaceAll("\\s{2,}", "  ");
    }
}
