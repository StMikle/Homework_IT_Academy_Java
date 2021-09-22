package home_work_1.task_eight;

public class TaskFive_3 implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        String wait = "Я тебя так долго ждал";
        String answer = "";

        switch ((name != null) ? name : "null") {
            case "null":
                answer = "Null!!!";
                break;
            case "Вася":
                answer = "Привет!\n" + wait;
                break;
            case "Анастасия":
                answer = wait;
                break;
            default:
                answer = "Добрый день, а вы кто?";
        }
        return answer;
    }
}
