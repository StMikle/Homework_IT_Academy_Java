package home_work_6;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    /**
     * Реализация метода интерфейса, который ищет слово в тексте, не применяя регулярные выражения
     * @param text текст в котором ищем
     * @param word слово, которое ищем
     * @return количество повторений слова
     */
    @Override
    public long search(String text, String word) {
        long count = 0;
        int indx = 0;

        do {
            indx = text.indexOf(word, indx);
            if (indx >= 0 && chek(text, word, indx)) {
                count++;
            }
            indx++;
        } while (indx > 0);

        return count;
    }

    /**
     * Метод, который проверяет, чтобы границы слова были символы-разделители
     * @param text текст в котором будем искать слово
     * @param word слово, которое ищем
     * @param indx индекс вхождения этого слова
     * @return true - если границы слова это - символы-разделители
     *          false - если не подходит под условие
     */
    public static boolean chek(String text, String word, int indx) {
        int lengthWord = word.length();
        char[] chars = ",. ;:'\")(?!\n\t".toCharArray();
        boolean chekFirst = false;
        boolean chekLast = false;
         if (indx == 0) {
            chekFirst = true;
        }
         if (indx == text.length() - lengthWord) {
            chekLast = true;
        }

        for (char aChar : chars) {
            if (!chekFirst && text.charAt(indx - 1) == aChar) {
                chekFirst = true;
            }
            if (!chekLast && text.charAt(indx + lengthWord) == aChar) {
                chekLast = true;
            }
            if (chekFirst && chekLast) {
                break;
            }
        }
        return chekFirst && chekLast;
    }
}
