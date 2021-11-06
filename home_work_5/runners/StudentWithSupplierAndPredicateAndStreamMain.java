package home_work_5.runners;

import home_work_5.comparators.StudentAgeComparator;
import home_work_5.comparators.StudentNameComparator;
import home_work_5.comparators.StudentScoreComparator;
import home_work_5.dto.Student;
import home_work_5.generator.NameRandomFileGenerator;
import home_work_5.generator.api.INameGenerator;
import home_work_5.suppliers.StudentRandomSupplier;
import home_work_5.top_condition.TopCondition;
import home_work_5.top_condition.TopConditionGroupStudents;
import home_work_5.top_condition.api.ITopCondition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentWithSupplierAndPredicateAndStreamMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        INameGenerator nameGenerator = new NameRandomFileGenerator("./src/home_work_5/files/names.txt");
        Supplier<Student> studentSupplier = new StudentRandomSupplier(nameGenerator, rnd);

        System.out.println("Выберите, сколько всего студентов вы хотите создать: ");
        int count = 0;
        if (scanner.hasNextInt()) count = scanner.nextInt();
        List<Student> students = Stream.generate(studentSupplier)
                .limit(count)
                .collect(Collectors.toList());

        Predicate<Student> filter = null;
        Comparator<Student> comparator = null;
        ITopCondition<Student> topCondition;

        do {
            System.out.println("Будем фильтровать? (true/false)");
            boolean choiceForFilter = false;
            if (scanner.hasNextBoolean()) choiceForFilter = scanner.nextBoolean();

            if (choiceForFilter) {
                System.out.println("По какому критерию");
                System.out.println("1 - по оценке");
                System.out.println("2 - по возрасту");
                System.out.println("3 - по оценке и по возрасту");
                int setFilter = 0;
                if (scanner.hasNextInt()) setFilter = scanner.nextInt();

                switch (setFilter) {
                    case 1: {
                        double paramScore = 0;
                        System.out.print("Больше какой оценки должно быть: ");
                        if (scanner.hasNextDouble()) paramScore = scanner.nextInt();
                        double finalParamScore = paramScore;
                        filter = (student) -> student.getAverageScore() > finalParamScore;
                    }
                    break;
                    case 2: {
                        int paramAge = 0;
                        System.out.print("Больше какого возраста должно быть: ");
                        if (scanner.hasNextInt()) paramAge = scanner.nextInt();
                        int finalParamAge = paramAge;
                        filter = (student) -> student.getAge() > finalParamAge;
                    }
                    break;
                    case 3: {
                        int paramAge = 0;
                        double paramScore = 0;
                        System.out.print("Больше какого возраста должно быть: ");
                        if (scanner.hasNextInt()) paramAge = scanner.nextInt();

                        System.out.print("Больше какой оценки должно быть: ");
                        if (scanner.hasNextDouble()) paramScore = scanner.nextInt();
                        double finalParamScore = paramScore;
                        int finalParamAge = paramAge;
                        filter = (student) -> student.getAverageScore() > finalParamScore && student.getAge() > finalParamAge;
                    }
                }
            }

            System.out.println("Будем сортировать? (true/false)");
            boolean choiceForSort = false;
            if (scanner.hasNextBoolean()) choiceForSort = scanner.nextBoolean();
            topCondition = new TopCondition<Student>();

            if (choiceForSort) {
                System.out.println("По какому критерию");
                System.out.println("1 - по оценке");
                System.out.println("2 - по имени");
                System.out.println("3 - по возрасту");
                System.out.println("4 - по возрасту и оценке");
                int setSort = scanner.nextInt();

                switch (setSort) {
                    case 1:
                        comparator = new StudentScoreComparator().reversed();
                        break;
                    case 2:
                        comparator = new StudentNameComparator();
                        break;
                    case 3:
                        comparator = new StudentAgeComparator();
                        break;
                    case 4:
                        comparator = new StudentAgeComparator().thenComparing(new StudentScoreComparator().reversed());
                        topCondition = new TopConditionGroupStudents();
                }
            }

            System.out.println("Сколько людей вы хотите видеть?");
            int countTop = 0;
            if (scanner.hasNextInt()) countTop = scanner.nextInt();

            List<Student> filtered = new ArrayList<>();

            if (choiceForFilter && choiceForSort) {
                filtered = students.stream()
                        .limit(count)
                        .filter(filter)
                        .sorted(comparator)
                        .collect(Collectors.toList());
            } else if (choiceForFilter && !choiceForSort) {
                filtered = students.stream()
                        .limit(count)
                        .filter(filter)
                        .collect(Collectors.toList());
            } else if (!choiceForFilter && choiceForSort) {
                filtered = students.stream()
                        .limit(count)
                        .sorted(comparator)
                        .collect(Collectors.toList());
            } else {
                topCondition.show(students, countTop);
            }
            topCondition.show(filtered, countTop);

            System.out.println("Повторим? (true/false)");
            boolean choiceForRepeat = false;
            if (scanner.hasNextBoolean()) choiceForRepeat = scanner.nextBoolean();
            if (!choiceForRepeat) break;
        } while (true);
    }
}