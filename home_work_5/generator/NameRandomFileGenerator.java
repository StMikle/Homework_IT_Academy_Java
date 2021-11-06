package home_work_5.generator;

import home_work_5.dataStorage.TextFileDataSource;
import home_work_5.generator.api.INameGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Класс, который реализует интерфейс INameGenerator
 */
public class NameRandomFileGenerator implements INameGenerator {

    /**
     * Поле типа List<String> для хранения имён
     */
    private final List<String> names = new ArrayList<>();

    /**
     * Конструктор, принимающий путь к файлу с именами
     * и вызывает метод loadData() класса TextFileDataSource
     * для загрузки имён из файла в поле names
     * @param file путь к файлу с именами типа String
     */
    public NameRandomFileGenerator(String file) {
        TextFileDataSource data = new TextFileDataSource();
        data.loadData(file, this.names);
    }

    /**
     * Реализация метода интерфейса INameGenerator
     * @return рандомное по номеру имя из коллекции имён names
     */
    @Override
    public String getName() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return this.names.get(rnd.nextInt(0, names.size()));
    }
}
