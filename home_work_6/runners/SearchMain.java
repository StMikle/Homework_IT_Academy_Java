package home_work_6.runners;

import home_work_6.ConvertTextToArray;
import home_work_6.EasySearch;
import home_work_6.RegExSearch;
import home_work_6.SearchEnginePunctuationNormalizer;
import home_work_6.api.ISearchEngine;
import home_work_6.dataStorage.TextFileDataSource;

import java.util.Scanner;

public class SearchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextFileDataSource dataSource = new TextFileDataSource();
        String text = dataSource.loadData("Война и мир_книга.txt");
        ISearchEngine iSearchEngine;

        String test = " misha  misha  dfafaf ";

        ConvertTextToArray convertTextToArray = new ConvertTextToArray();
        text = convertTextToArray.replacePunctuationChars(text);
        System.out.println(text);
        System.out.println("Введите слово, которое вы хотите найти в тексте");
        String word = sc.next();
        iSearchEngine = new SearchEnginePunctuationNormalizer(new EasySearch());
        long countOne = iSearchEngine.search(test, word);
        iSearchEngine = new SearchEnginePunctuationNormalizer(new RegExSearch());
        long countTwo = iSearchEngine.search(test, word);
        System.out.println("Слово: " + word + " Количество - " + countOne);
        System.out.println("Слово: " + word + " Количество - " + countTwo);
    }
}
