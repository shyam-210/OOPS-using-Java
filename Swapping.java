import java.util.Scanner;

public class Swapping {
    int num1, num2, temp;

    void getInput() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        num1 = obj.nextInt();
        System.out.println("Enter the number 2:");
        num2 = obj.nextInt();
    }

    void display() {
        System.out.println(" Number 1 value is: " + num1);
        System.out.println(" Number 2 value is: " + num2);
    }

    void swap() {
        temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public static void main(String args[]) {
        Swapping s = new Swapping();
        s.getInput();
        System.out.println("Before Swapping");
        s.display();
        s.swap(); // to perform swapping System.out.println("After Swapping"); s.display();
    }
}
