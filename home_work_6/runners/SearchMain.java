package home_work_6.runners;

import home_work_6.utils.EasySearch;
import home_work_6.utils.RegExSearch;
import home_work_6.decorators.SearchEngineCaseInsensitive;
import home_work_6.decorators.SearchEnginePunctuationNormalizer;
import home_work_6.api.ISearchEngine;
import home_work_6.utils.TextFileToString;

import java.util.Scanner;

public class SearchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextFileToString dataSource = new TextFileToString();
        String text = dataSource.loadData("./src/home_work_6/Война и мир_книга.txt");
        ISearchEngine iSearchEngine;

        System.out.println("Введите слово, которое вы хотите найти в тексте");
        String word = sc.next();

        System.out.println("Использование метода search() класса EasySearch с учётом регистра");
        iSearchEngine = new SearchEnginePunctuationNormalizer(new EasySearch());
        long count = iSearchEngine.search(text, word);
        System.out.println("Слово: " + word + " Количество - " + count);

        System.out.println("Использование метода search() класса RegExSearch с учётом регистра");
        iSearchEngine = new SearchEnginePunctuationNormalizer(new RegExSearch());
        count = iSearchEngine.search(text, word);
        System.out.println("Слово: " + word + " Количество - " + count);

        System.out.println("Использование метода search() класса EasySearch без учёта регистра");
        iSearchEngine = new SearchEngineCaseInsensitive(new SearchEnginePunctuationNormalizer(new EasySearch()));
        count = iSearchEngine.search(text, word);
        System.out.println("Слово: " + word + " Количество - " + count);

        System.out.println("Использование метода search() класса RegExSearch без учёта регистра");
        iSearchEngine = new SearchEngineCaseInsensitive(new SearchEnginePunctuationNormalizer(new RegExSearch()));
        count = iSearchEngine.search(text, word);
        System.out.println("Слово: " + word + " Количество - " + count);

//       5. Используя реализации интерфейса ISearchEngine вывести информацию как часто встречаются слова:
//       "война", "и" (как союз), "мир" вне зависимости от регистра.
        System.out.println("\nПоиск слов \"война\", \"и\" (как союз), \"мир\" без учёта регистра:\n");
        System.out.println("Использование метода search() класса EasySearch без учёта регистра");
        iSearchEngine = new SearchEngineCaseInsensitive(new SearchEnginePunctuationNormalizer(new EasySearch()));
        count = iSearchEngine.search(text, "война");
        System.out.println("Слово: " + "война" + "\tКоличество - " + count);
        count = iSearchEngine.search(text, "и");
        System.out.println("Слово: " + "и" + "\tКоличество - " + count);
        count = iSearchEngine.search(text, "мир");
        System.out.println("Слово: " + "мир" + "\tКоличество - " + count);

        System.out.println("Использование метода search() класса RegExSearch без учёта регистра");
        iSearchEngine = new SearchEngineCaseInsensitive(new SearchEnginePunctuationNormalizer(new RegExSearch()));
        count = iSearchEngine.search(text, "война");
        System.out.println("Слово: " + "война" + "\tКоличество - " + count);
        count = iSearchEngine.search(text, "и");
        System.out.println("Слово: " + "и" + "\tКоличество - " + count);
        count = iSearchEngine.search(text, "мир");
        System.out.println("Слово: " + "мир" + "\tКоличество - " + count);
    }
}