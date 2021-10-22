package home_work_6.decorators;

import home_work_6.api.ISearchEngine;

public class SearchEngineCaseInsensitive implements ISearchEngine {

    /**
     * поле типа ISearchEngine
     */
    private final ISearchEngine iSearchEngine;

    /**
     * Конструктор принимающий переменную типа ISearchEngine
     * @param iSearchEngine - переменная типа ISearchEngine
     */
    public SearchEngineCaseInsensitive(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    /**
     * Метод, который приводит текст и слово к нижнему регистру и передаёт их методу search()
     * класса Search переданного в конструктор полю iSearchEngine
     * @param text - переданный текст
     * @param word - слово, которое ищем
     * @return количество найденных слов типа long
     */
    @Override
    public long search(String text, String word) {
        return iSearchEngine.search(text.toLowerCase(), word.toLowerCase());
    }
}
