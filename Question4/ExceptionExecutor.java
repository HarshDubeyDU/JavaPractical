package Question4;

public class ExceptionExecutor {
    public void test(int age) throws Underage {
        if (age < 18) {
            throw new Underage(age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}