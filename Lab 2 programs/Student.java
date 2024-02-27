import java.util.Scanner;

public class Student{
    private String usn;
    private String name;
    private int credits[];
    private float marks[];

    public Student(String usn, String name) {
        this.usn = usn;
        this.name = name;
        this.credits = new int[9];
        this.marks = new float[9];
    }

    public int[] getCredits(Scanner sc) {
        System.out.println("Enter credits for subjects 1 to 9");
        for (int i = 0; i < 9; i++) {
            System.out.print("Subject " + (i + 1) + " credit: ");
            this.credits[i] = sc.nextInt();
        }
        return credits;
    }

    public float[] getMarks(Scanner sc) {
        System.out.println("Enter marks for subjects 1 to 9");
        for (int i = 0; i < 9; i++) {
            System.out.print("Subject " + (i + 1) + " mark: ");
            this.marks[i] = sc.nextFloat();
        }
        return marks;
    }

    public float calculateCGPA() {
        Scanner sc = new Scanner(System.in); // Creating new scanner instance
        float[] marks = getMarks(sc);
        int[] credits = getCredits(sc);
        sc.close(); // Closing the scanner after use

        int total_credits = 0;
        float total_weightage = 0;

        for (int i = 0; i < 9; i++) {
            total_credits += credits[i];
            total_weightage += marks[i] * credits[i];
        }

        float cgpa = total_weightage / total_credits;
        return cgpa;
    }

    public void display() {
        float cgpa = calculateCGPA();
        System.out.printf("The CGPA for the student %s is %.2f%n", (name + "(" + usn + ")"), cgpa);
    }
}


