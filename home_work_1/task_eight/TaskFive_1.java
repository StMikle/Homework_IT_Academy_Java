package home_work_1.task_eight;

public class TaskFive_1 implements ICommunicationPrinter{
    @Override
    public String welcome(String name) {
        if (name == null) {
            return "Null!!!";
        }

        if ("Вася".equals(name)) {
            return "Привет!" + "\nЯ тебя так долго ждал";
        }

        if ("Анастасия".equals(name)) {
            return "Я тебя так долго ждал";
        }

        return "Добрый день, а вы кто?";
    }
}
