package Question4;

public class Underage extends Exception {
    private int age;

    public Underage(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Under age: " + age;
    }
}
