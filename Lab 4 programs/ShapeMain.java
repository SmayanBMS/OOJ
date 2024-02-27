import java.util.Scanner;

public class ShapeMain {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the length and the breadth of the rectangle: ");
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            Rectangle shape1 = new Rectangle(length, breadth);

            System.out.println("Enter the radius of the circle: ");
            int radius = sc.nextInt();
            Circle shape2 = new Circle(radius, 0);

            System.out.println("Enter the base and the height of the triangle: ");
            int base = sc.nextInt();
            int height = sc.nextInt();
            Triangle shape3 = new Triangle(base, height);

            shape1.printArea();
            shape2.printArea();
            shape3.printArea();
        }
    }
}
