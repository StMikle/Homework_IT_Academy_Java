package home_work_5.dto;

public class Student {

    /**
     * Поле типа int для порядкового номера
     */
    private int id;

    /**
     * Поле типа String для имён
     */
    private String name;

    /**
     * Поле типа int для возраста
     */
    private int age;

    /**
     * Поле типа double для средней оценки
     */
    private double averageScore;

    /**
     * Поле типа boolean которое показывает студент олимпиадник или нет
     */
    private boolean olimpic;

    /**
     * Конструктор присваивающий полям класса переданные аргументы
     * @param id - порядкового номера типа int
     * @param name - имя типа String
     * @param age - возраст типа int
     * @param averageScore - средняя оценка типа double
     * @param olimpic - олимпиадник или нет типа boolean
     */
    public Student(int id, String name, int age, double averageScore, boolean olimpic) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
        this.olimpic = isOlimpic();
    }

    /**
     * Метод (getter)
     * @return поле id типа int
     */
    public int getId() {
        return id;
    }

    /**
     * Метод (setter)
     * @param id - переданный аргумент типа int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Метод (getter)
     * @return поле name типа String
     */
    public String getName() {
        return name;
    }

    /**
     * Метод (setter)
     * @param name - переданный аргумент типа String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод (getter)
     * @return поле age типа int
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод (setter)
     * @param age - переданный аргумент типа int
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Метод (getter)
     * @return поле averageScore типа double
     */
    public double getAverageScore() {
        return averageScore;
    }

    /**
     * Метод (setter)
     * @param score - переданный аргумент типа double
     */
    public void setScore(double score) {
        this.averageScore = score;
    }

    /**
     * Метод (getter)
     * @return поле olimpic типа boolean
     */
    public boolean isOlimpic() {
        return olimpic;
    }

    /**
     * Метод (setter)
     * @param olimpic - переданный аргумент типа boolean
     */
    public void setOlimpic(boolean olimpic) {
        this.olimpic = olimpic;
    }

    /**
     * Переопределение метода toString()
     * @return строку содержащую значение всех полей класса Student типа String
     */
    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", score = " + averageScore +
                ", isOlimpiad = " + olimpic +
                '}';
    }
}
