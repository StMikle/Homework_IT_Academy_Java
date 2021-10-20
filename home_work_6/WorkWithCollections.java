package home_work_6;

import java.util.*;

public class WorkWithCollections {
    /**
     * Метод, который заполняет коллекцию реализующую интерфейс Map<String, Long> словами из массива str,
     * где ключ - слово типа String, значение - количество этих слов типа Long
     * @param text строка с текстом
     * @return объект типа HashMap<String, Long>
     */
    public Map<String, Long> mapWordsAndNumbers(String text) {
        Map<String, Long> map = new HashMap<>();
        String[] textArray = text.split("  ");
        for (String s : textArray) {
            if (map.containsKey(s)) {
                long value = map.get(s);
                map.put(s, ++value);
            } else {
                map.put(s, 1L);
            }
        }
        return map;
    }

    /**
     * Метод, который заполняет коллекцию реализующую интерфейс Set словами из массива str
     * @param text массив слов типа String
     * @return объект типа HashSet<String> содержащий уникальные слова
     */
    public Set<String> setWords(String text) {
        return new HashSet<String>(List.of(text.split("  ")));
    }

    public String replacePunctuationChars(String text) {
        String chars = "(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)";
        text = text.replaceAll(chars, "  ").replaceAll("\\s{2,}", "  ");
        return text;
    }
}
