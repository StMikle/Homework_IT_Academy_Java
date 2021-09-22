package home_work_1.task_eight;

public class TaskFive_3 implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {
        String wait = "Я тебя так долго ждал";
        switch (name) {
            case "Вася":
                return "Привет!\n" + wait;
            case "Анастасия":
                return wait;
            default:
                return "Добрый день, а вы кто?";
        }
    }
}
