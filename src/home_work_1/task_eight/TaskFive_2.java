package home_work_1.task_eight;

public class TaskFive_2 implements ICommunicationPrinter{
    @Override
    public String welcom(String name) {
        String wait = "Я тебя так долго ждал";
        if (name.equals("Вася")) {
            return "Привет!\n" + wait;
        } else if (name.equals("Анастасия")) {
            return wait;
        } else {
            return "Добрый день, а вы кто?";
        }
    }
}
