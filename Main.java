
import java.util.Scanner;
import P1.Shape;
import P2.Rectangle;
import P3.Circle;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of shape (Rectangle/Circle):");
        String shapeType = sc.next().toLowerCase();

        Shape shape = switch (shapeType) {
            case "rectangle" -> {
                System.out.println("Enter length and width:");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                return new Rectangle(length, width);
            }
            case "circle" -> {
                System.out.println("Enter radius:");
                double radius = sc.nextDouble();
                return new Circle(radius);
            }
            default -> {
                System.out.println("Invalid shape type!");
                sc.close();
                return null;
            }
        };

        if (shape != null) {
            double area = shape.calculateArea();
            System.out.println("Area of " + shapeType + " is: " + area);
        }
    }
}
