package home_work_1.task_eight;

public class TaskFive_2 implements ICommunicationPrinter{
    @Override
    public String welcome(String name) {
        String wait = "Я тебя так долго ждал";
        if (name == null) {
            return "Null!!!";
        } else if ("Вася".equals(name)) {
            return "Привет!\n" + wait;
        } else if ("Анастасия".equals(name)) {
            return wait;
        } else {
            return "Добрый день, а вы кто?";
        }
    }
}
