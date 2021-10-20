package home_work_6;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

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

    public static boolean chek(String text, String word, int indx) {
        int lengthWord = word.length();
        char[] chars = ",. ;:'\")(?!".toCharArray();
        boolean chekFirst = false;
        boolean chekLast = false;
        if (indx == 0) {
            chekFirst = true;
        } else if (indx == text.length() - 1) {
            chekLast = true;
        }

        for (int i = 0; i < chars.length; i++) {
            if (!chekFirst && text.charAt(indx - 1) == chars[i]) {
                chekFirst = true;
            }
            if (!chekLast && text.charAt(indx + lengthWord) == chars[i] ) {
                chekLast = true;
            }
            if (chekFirst && chekLast) {
                break;
            }
        }
        return chekFirst && chekLast;
    }
}
