package home_work_6.runners;

import home_work_6.EasySearch;
import home_work_6.RegExSearch;
import home_work_6.SearchEngineCaseInsensitive;
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

        String test = "Папа мама я - дрУжная Семья";
        System.out.println("Введите слово, которое вы хотите найти в тексте");
        String word = sc.next();
        System.out.println("Использование метода search() класса EasySearch с учёта регистра");
        iSearchEngine = new SearchEnginePunctuationNormalizer(new EasySearch());
        long count = iSearchEngine.search(test, word);
        System.out.println("Слово: " + word + " Количество - " + count);

        System.out.println("Использование метода search() класса RegExSearch с учёта регистра");
        iSearchEngine = new SearchEnginePunctuationNormalizer(new RegExSearch());
        count = iSearchEngine.search(test, word);
        System.out.println("Слово: " + word + " Количество - " + count);

//        System.out.println("Использование метода search() класса EasySearch без учёта регистра");
//        iSearchEngine = new SearchEngineCaseInsensitive(new EasySearch());
//        count = iSearchEngine.search(test, word);
//        System.out.println("Слово: " + word + " Количество - " + count);
//
//        System.out.println("Использование метода search() класса RegExSearch без учёта регистра");
//        iSearchEngine = new SearchEngineCaseInsensitive(new RegExSearch());
//        count = iSearchEngine.search(test, word);
//        System.out.println("Слово: " + word + " Количество - " + count);
    }
}
