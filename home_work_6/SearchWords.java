package home_work_6;

import home_work_6.comparators.MapValueComparator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Pattern;

public class SearchWords {
    public static void main(String[] args) {
        String str = loadData("Война и мир_книга.txt");
        Pattern pattern = Pattern.compile("\\s*(\\s*--\\s|\\s-|-\\s|\\s|\\(|\\)|,|\\*|=|\"|!|;|\\?|:|\\.)+\\s*");
        String[] words = pattern.split(str);

//      2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
        Set<String> uniqueWords = setWords(words);
        System.out.println("Количество слов: " + uniqueWords.size());

//      2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
        Map<String, Long> mapTest = mapWordsAndNumbers(words);
        List<Map.Entry<String, Long>> list = new ArrayList<>(mapTest.entrySet());
        MapValueComparator mapValueComparator = new MapValueComparator();
        list.sort(mapValueComparator);

        System.out.print("Введите, какое сколько слов в топе вы хотите увидеть: ");
        Scanner sc = new Scanner(System.in);
        int number = 0;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        }
        System.out.println("Топ " + number + " слов");
        for (int i = 0; i < number; i++) {
            System.out.printf("Слово: %s  Количество: %s \n", list.get(i).getKey(), list.get(i).getValue());
        }
    }

    /**
     * Метод, который заполняет коллекцию реализующую интерфейс Map<String, Long> словами из массива str,
     * где ключ - слово типа String, значение - количество этих слов типа Long
     * @param str массив слов типа String
     * @return объект типа HashMap<String, Long>
     */
    public static Map<String, Long> mapWordsAndNumbers(String[] str) {
        Map<String, Long> map = new HashMap<>();
        for (String s : str) {
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
     * @param str массив слов типа String
     * @return объект типа HashSet<String> содержащий уникальные слова
     */
    public static Set<String> setWords(String[] str) {
        return new HashSet<>(List.of(str));
    }

    /**
     * Метод для перевода текста из файла в строку
     *
     * @param fileName имя файла
     * @return строку
     */
    public static String loadData(String fileName) {
        Path path = Path.of(fileName);
        String str = "";
        try {
            str = Files.readString(path);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом '" + fileName + "'.");
        }
        return str;
    }
}
