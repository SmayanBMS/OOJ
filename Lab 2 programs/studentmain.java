import java.util.Scanner;
public class studentmain {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name and USN:");
            String name = sc.nextLine();
            String usn = sc.nextLine();

            Student student1 = new Student(name, usn);
            student1.display();
        }
    }
}
