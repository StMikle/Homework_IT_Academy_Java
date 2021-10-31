package home_work_6.runners;

import home_work_6.utils.TextFileToString;
import home_work_6.utils.WorkWithCollections;
import home_work_6.comparators.MapValueComparator;

import java.util.*;

public class WorkWithCollectionsMain {

    public static void main(String[] args) {
        TextFileToString dataSource = new TextFileToString();
        String nameFile = "./src/home_work_6/Война и мир_книга.txt";
        String strText = dataSource.loadData(nameFile);
        WorkWithCollections workWithCollections = new WorkWithCollections(strText);

        Set<String> uniqueWords = workWithCollections.setWords();
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
        System.out.println("Количество слов: " + uniqueWords.size());

        Map<String, Long> mapTest = workWithCollections.mapWordsAndNumbers();
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
        for (Map.Entry<String, Long> stringLongEntry : list) {
            System.out.printf("Слово: %s  Количество: %s \n", stringLongEntry.getKey(), stringLongEntry.getValue());
            number--;
            if (number == 0) {
                break;
            }
        }
    }
}
