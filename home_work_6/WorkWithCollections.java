package home_work_6;

import java.util.*;

public class WorkWithCollections {

    /**
     * Поле типа String, которое хранит текст переданный в конструктор
     */
    private String text;

    /**
     * Конструктор, принимающий текст
     * @param text - текст, который мы передаём в конструктор
     */
    public WorkWithCollections(String text) {
        this.text = text;
    }

    /**
     * Метод, который заполняет коллекцию реализующую интерфейс Map<String, Long> словами из text,
     * где ключ - слово типа String, значение - количество этих слов типа Long
     * @return объект типа HashMap<String, Long>
     */
    public Map<String, Long> mapWordsAndNumbers() {
        Map<String, Long> map = new HashMap<>();
        this.text = replacePunctuationChars();
        String[] textArray = text.split("  ");
        for (String word : textArray) {
            if (map.containsKey(word)) {
                Long value = map.get(word);
                map.put(word, ++value);
            } else {
                map.put(word, 1L);
            }
        }
        return map;
    }

    /**
     * Метод, который заполняет коллекцию реализующую интерфейс Set словами из text
     * @return объект типа HashSet<String> содержащий уникальные слова
     */
    public Set<String> setWords() {
        this.text = replacePunctuationChars();
        return new HashSet<>(List.of(text.split("  ")));
    }

    public String replacePunctuationChars() {
        String chars = "(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)";
        this.text = text.replaceAll(chars, "  ").replaceAll("\\s{2,}", "  ");
        return text;
    }
}
