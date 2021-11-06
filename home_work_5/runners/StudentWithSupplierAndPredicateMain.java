package home_work_5.runners;

import home_work_5.comparators.StudentAgeComparator;
import home_work_5.comparators.StudentNameComparator;
import home_work_5.comparators.StudentScoreComparator;
import home_work_5.dto.Student;
import home_work_5.generator.NameRandomFileGenerator;
import home_work_5.generator.api.INameGenerator;
import home_work_5.predicates.StudentAgeAndScorePredicate;
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

public class StudentWithSupplierAndPredicateMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        INameGenerator nameGenerator = new NameRandomFileGenerator("./src/home_work_5/files/Names.txt");
        Supplier<Student> studentSupplier = new StudentRandomSupplier(nameGenerator, rnd);
        Comparator<Student> reversedScore = new StudentScoreComparator().reversed();

        int paramAge = 0;
        double paramScore = 0;
        System.out.print("\nВыберите фильтр для сортировки студентов:\n" +
                "По возрасту (тем кому (x) и выше), по оценке (выше (y)):\nx: ");
        if (scanner.hasNextInt()) {
            paramAge = scanner.nextInt();
        }
        System.out.print("y: ");
        if (scanner.hasNextDouble()) {
            paramScore = scanner.nextInt();
        }
        job(studentSupplier, new StudentNameComparator(), reversedScore,
                new StudentAgeComparator().thenComparing(reversedScore),
                new StudentAgeAndScorePredicate(paramAge, paramScore),
                new TopCondition<Student>(), new TopConditionGroupStudents());
    }

    public static <T> void job(Supplier<T> supplier, Comparator<T> comparator1,
                               Comparator<T> comparator2, Comparator<T> comparator3,
                               Predicate<T> predicate, ITopCondition<T> top,
                               ITopCondition<T> groupedTop) {

        int countStudents = 0;
        System.out.println("Выберите, сколько всего студентов вы хотите создать: ");
        if (scanner.hasNextInt()) {
            countStudents = scanner.nextInt();
        }

        List<T> listStudent = new ArrayList<>();
        for (int i = 0; i < countStudents; i++) {
            listStudent.add(supplier.get());
        }

        List<T> filtered = new ArrayList<>();
        for (T item : listStudent) {
            if(predicate.test(item)){
                filtered.add(item);
            }
        }

        System.out.println("\nКоличество отфильтрованных студентов:");
        for (T item : filtered) {
            System.out.println(item);
        }
        System.out.println("\nКоличество таких студентов: " + filtered.size());

        int numTop = 0;
        boolean check;
        System.out.println("\nВыберите сколько студентов в топе вы хотите вывести в каждой сортировке: ");
        do {
            check = false;
            if (scanner.hasNextInt()) {
                numTop = scanner.nextInt();
                if (numTop > filtered.size()) {
                    System.out.println("Выберите меньшее число людей в топе !!!");
                    check = true;
                }
            }
        } while (check);

        System.out.println("\nСортировка по имени:\n");
        filtered.sort(comparator1);
        top.show(filtered, numTop);

        System.out.println("\nСортировка по оценке:\n");
        filtered.sort(comparator2);
        filtered.sort(comparator1);
        top.show(filtered, numTop);

        System.out.println("\nСортировка по возрасту и оценке:");
        filtered.sort(comparator3);
        groupedTop.show(filtered, countStudents);
    }
}