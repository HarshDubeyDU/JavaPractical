package Question4;

public class Main {
    public static void main(String[] args) {
        ExceptionExecutor executor = new ExceptionExecutor();
        try {
            executor.test(25);
            executor.test(55);
            executor.test(15);
        } catch (Underage e) {
            System.out.println(e);
        }
    }
}
