package home_work_5.runners;

import home_work_5.comparators.StudentAgeComparator;
import home_work_5.comparators.StudentNameComparator;
import home_work_5.comparators.StudentScoreComparator;
import home_work_5.dataStorage.TextFileDataSource;
import home_work_5.dto.Student;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class StudentMain {
    static ThreadLocalRandom rnd = ThreadLocalRandom.current();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        List<String> listName = new ArrayList<>();
        TextFileDataSource data = new TextFileDataSource();
        String fileAddress = "./src/home_work_5/files/Names.txt";
        data.loadData(fileAddress, listName);
        createStudents(listStudent, listName);

        System.out.println("Вывод всех студентов");
        outCollection(listStudent);

        int paramAge = 0;
        int paramScore = 0;
        System.out.print("\nВыберите фильтр для сортировки студентов:\n" +
                "По возрасту (тем кому (x) и выше), по оценке (выше (y)):\nx: ");
        if (scanner.hasNextInt()) {
            paramAge = scanner.nextInt();
        }
        System.out.print("y: ");
        if (scanner.hasNextInt()) {
            paramScore = scanner.nextInt();
        }

        List<Student> listWithParameter = new ArrayList<>();
        for (Student student : listStudent) {
            if (student.getAge() >= paramAge && student.getAverageScore() > paramScore) {
                listWithParameter.add(student);
            }
        }

        System.out.printf("\nСтуденты, возраст которых %d и больше, и оценка выше %d:\n", paramAge, paramScore);
        outCollection(listWithParameter);
        System.out.println("\nКоличество таких студентов: " + listWithParameter.size());

        StudentNameComparator studentNameComparator = new StudentNameComparator();
        StudentAgeComparator studentAgeComparator = new StudentAgeComparator();
        StudentScoreComparator studentScoreComparator = new StudentScoreComparator();
        Comparator<Student> reversed = new StudentScoreComparator().reversed();

        int numTop = 0;
        boolean check;
        System.out.println("\nВыберите сколько студентов в топе вы хотите вывести в каждой сортировке: ");
        do {
            check = false;
            if (scanner.hasNextInt()) {
                numTop = scanner.nextInt();
                if (numTop > listWithParameter.size()) {
                    System.out.println("Выберите меньшее число людей в топе !!!");
                    check = true;
                }
            }
        } while (check);


        System.out.println("\nСортировка по имени:\n");
        int index = 0;
        listWithParameter.sort(studentNameComparator);
        for (Student student : listWithParameter) {
            System.out.println(student);
            index++;
            if (index >= numTop) {
                break;
            }
        }

        System.out.println("\nСортировка по оценке:\n");
        listWithParameter.sort(studentScoreComparator);
        index = 0;
        for (Student student : listWithParameter) {
            System.out.println(student);
            index++;
            if (index >= numTop) {
                break;
            }
        }

        System.out.println("\nСортировка по возрасту и оценке:");
        listWithParameter.sort(studentAgeComparator.thenComparing(reversed));

        index = 0;
        int currentAge = -1;
        for (Student student : listWithParameter) {
            if(currentAge == -1 || currentAge != student.getAge()) {
                index = 0;
                currentAge = student.getAge();
                System.out.println("\nВозраст: " + student.getAge());
            }

            if (index >= numTop && currentAge == student.getAge()) {
                continue;
            }

            System.out.println(student);

            index++;
        }
    }

    /**
     * Метод, который спрашивает диапазон для значений полей класса Student и генерирует их
     * @param listStudent - переменная типа List<String> хранящая ссылку на объект типа ArrayList<String>
     * @param listName - переменная типа List<String> хранящая ссылку на объект типа ArrayList<String>
     */
    public static void createStudents(List<Student> listStudent, List<String> listName) {
        int numStudents = 0;
        int ageFrom = 0;
        int ageTo = 0;
        int listNameSize = listName.size();
        System.out.println("Выберите, сколько студентов вы хотите создать: ");
        if (scanner.hasNextInt()) {
            numStudents = scanner.nextInt();
        }
        System.out.print("Выберите диапазон возраста студентов:\nОт: ");
        if (scanner.hasNextInt()) {
            ageFrom = scanner.nextInt();
        }
        System.out.print("До: ");
        if (scanner.hasNextInt()) {
            ageTo = scanner.nextInt();
        }


        for (int i = 0; i < numStudents; i++) {
            int age = rnd.nextInt(ageFrom, ageTo + 1);
            double averageScore = rnd.nextDouble(0, 10);
            boolean isOlimpiad = rnd.nextBoolean();
            String name = randomString(listName, listNameSize);

            listStudent.add(new Student(i + 1, name, age, averageScore, isOlimpiad));
        }
    }

    /**
     * Метод (generic), который выводит список переданную в параметр
     * @param list - переменная типа List<String> хранящая ссылку на объект типа ArrayList<String>
     * @param <T> - типа нашего листа
     */
    public static <T> void outCollection(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    /**
     * Метод, который возвращает рандомное по номеру имя из листа listName
     * @param listName - переменная типа List<String> хранящая ссылку на объект типа ArrayList<String>
     * @param listNameSize - размер listName
     * @return рандомное по номеру имя из listName типа String
     */
    public static String randomString(List<String> listName, int listNameSize) {
        int num = rnd.nextInt(0, listNameSize);
        return listName.get(num);
    }
}
