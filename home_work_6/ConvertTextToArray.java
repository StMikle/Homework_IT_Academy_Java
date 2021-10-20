package home_work_6;

public class ConvertTextToArray {

    public String replacePunctuationChars(String text) {
        String chars = "(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)";
        text = text.replaceAll(chars, "  ").replaceAll("\\s{2,}", "  ");
        return text;
    }
}
