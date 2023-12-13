import java.util.Scanner;
class Quad{
    double[] getCoefficients(){
        try (Scanner sc = new Scanner(System.in)) {
            double[] coefficients = new double[3];
            System.out.println("The coefficients are in order a,b,c [ax^2 + by + c]");
            System.out.println("Enter value of a");
            coefficients[0] = sc.nextDouble();
            while (coefficients[0] == 0){
                System.out.println("First coefficient cannot be 0, enter again");
                coefficients[0] = sc.nextDouble();
            }
            System.out.println("Enter value of b");
            coefficients[1] = sc.nextDouble();
            System.out.println("Enter value of c");
            coefficients[2] = sc.nextDouble();
            return coefficients;
        }
    }

    void calculate(double coefficients[]){
        double a; double b; double c;
        double r1; double r2;
        a = coefficients[0];
        b = coefficients[1];
        c = coefficients[2];
        double d = (b * b) - 4 * a * c;
        if(d==0){
            r1 = (-b)/(2*a);
            System.out.println("Roots are real and equal");
            System.out.println("Roo1 = Root2 = " + r1);
        }
        else if(d>0){
            r1 = ((-b)+(Math.sqrt(d)))/(double)(2*a);
            r2 = ((-b)-(Math.sqrt(d)))/(double)(2*a);
            System.out.println("Roots are real and distinct");
            System.out.println("Roo1 = " + r1 + " Root2 = " + r2);
            }
        else if(d<0){
            System.out.println("Roots are imaginary");
            r1 = (-b)/(2*a);
            r2 = Math.sqrt(-d)/(2*a);
            System.out.println("Root1 = " + r1 + " + i"+r2);
            System.out.println("Root1 = " + r1 + " - i"+r2);
        }
    }
}
