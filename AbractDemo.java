import java.util.Scanner;

public class AbractDemo {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length and breadth of Rectangle class:");
        Rectangle r = new Rectangle(obj.nextInt(), obj.nextInt());
        r.printArea();
        System.out.println("Enter the base and height of Triangle class:");
        Triangle t = new Triangle(obj.nextInt(), obj.nextInt());
        t.printArea();
    }
}

abstract class AbstractDemo {
    int length, breadth;

    AbstractDemo(int l, int b) {
        length = l;
        breadth = b;
    }

    abstract void printArea();
}

class Rectangle extends AbstractDemo {
    Rectangle(int l, int b) {
        super(l, b);
    }

    void printArea() {
        System.out.println("The Area of Rectangle is:" + length * breadth);
    }
}

class Triangle extends AbstractDemo {
    Triangle(int l, int b) {
        super(l, b);
    }

    void printArea() {
        System.out.println("The Area of Triangle is:" + 0.5 * length * breadth);
    }
}
