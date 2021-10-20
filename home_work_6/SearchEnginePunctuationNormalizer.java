package home_work_6;

import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private String clearText;
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
     * класса Search переданного в конструктор полю result и возвращает значение этого поля
     * @param text - переданный текст
     * @param word - слово, которое ищем
     * @return количество найденных слов типа long
     */
    @Override
    public long search(String text, String word) {
        return iSearchEngine.search(replacePunctuationChars(text), word);
    }

    public String replacePunctuationChars(String text) {
        String chars = "(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)";
        this.clearText = text.replaceAll(chars, "  ").replaceAll("\\s{2,}", "  ");
        return this.clearText;
    }
}
