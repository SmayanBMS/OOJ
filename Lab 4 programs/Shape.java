abstract class shape{
    protected int n1;
    protected int n2;
    public shape(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    abstract void printArea();
}

class Rectangle extends shape{
    public Rectangle(int length, int breadth){
        super(length, breadth);
    }

    @Override
    void printArea(){
        double area = this.n1 * this.n2;
        System.out.printf("The area of the rectangle is %.3f\n", area);
    }
}

class Circle extends shape{
    double PI = 3.14;
    public Circle(int radius, int zero){
        super(radius, radius);
    }

    @Override
    void printArea(){
        double area = this.n1 * this.n2 * PI;
        System.out.printf("The area of the circle is %.3f \n", area);
    }
}

class Triangle extends shape{
    public Triangle(int base, int height){
        super(base, height);
    }

    @Override
    void printArea(){
        double area = this.n1 * this.n2 * 0.5;
        System.out.printf("The area of the Triangle is %.3f\n                                                               wn    nnnnn b  bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb ", area);
    }
}

