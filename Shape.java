import java.util.Scanner;

public class Shape {
    int side;

    void getInput() {
        System.out.println("Enter the side of Square object:");
        Scanner obj = new Scanner(System.in);
        side = obj.nextInt();
    }

    void areaSquare() {
        System.out.println("The area of Square Object is:" + side * side);
    }

    void perimeterSquare() {
        System.out.println("The perimeter of Square Object is:" + 4 * side);
    }

    void cube() {
        System.out.println("The volume of cube is:" + side * side * side);
    }

    public static void main(String args[]) {
        Shape e = new Shape();
        e.getInput();
        e.areaSquare();
        e.perimeterSquare();
        e.cube();
    }
}
