package home_work_1.task_eight;

public class TaskFive_1 implements ICommunicationPrinter{
    @Override
    public String welcom(String name) {
        if (name.equals("Вася")) {
            return ("Привет!" + "\nЯ тебя так долго ждал");
        }

        if (name.equals("Анастасия")) {
            return ("Я тебя так долго ждал");
        }

        return ("Добрый день, а вы кто?");
    }
}
