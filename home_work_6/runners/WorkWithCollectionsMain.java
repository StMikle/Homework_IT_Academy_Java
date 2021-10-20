package home_work_6.runners;


import home_work_6.ConvertTextToArray;
import home_work_6.WorkWithCollections;
import home_work_6.comparators.MapValueComparator;
import home_work_6.dataStorage.TextFileDataSource;

import java.util.*;

public class WorkWithCollectionsMain {

    public static void main(String[] args) {
        WorkWithCollections workWithCollections = new WorkWithCollections();
        TextFileDataSource dataSource = new TextFileDataSource();
        String nameFile = "Война и мир_книга.txt";
        String strText = dataSource.loadData(nameFile);
        ConvertTextToArray convertTextToArray = new ConvertTextToArray();
        strText = convertTextToArray.replacePunctuationChars(strText);

        Set<String> uniqueWords = workWithCollections.setWords(strText);
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
        System.out.println("Количество слов: " + uniqueWords.size());

        Map<String, Long> mapTest = workWithCollections.mapWordsAndNumbers(strText);
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
}
