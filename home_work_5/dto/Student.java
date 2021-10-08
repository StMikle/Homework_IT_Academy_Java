package home_work_5.dto;

public class Student {
    private int id;
    private String name;
    private int age;
    private double averageScore;
    private boolean isOlimpiad;

    public Student(int id, String name, int age, double averageScore, boolean isOlimpiad) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
        this.isOlimpiad = isOlimpiad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setScore(double score) {
        this.averageScore = score;
    }

    public boolean isOlimpiad() {
        return isOlimpiad;
    }

    public void setOlimpiad(boolean olimpiad) {
        isOlimpiad = olimpiad;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", score = " + averageScore +
                ", isOlimpiad = " + isOlimpiad +
                '}';
    }
}
