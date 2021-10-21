package home_work_6.api;

/**
 * Реализация поиска текста
 */
public interface ISearchEngine {
    /**
     * Поиск слова по тексту
     * @param text текст в котором ищем
     * @param word слово, которое ищем
     * @return количество найденных совпадений
     */
    long search(String text, String word);
}
