import java.util.Scanner;

interface Stack {
    void push(int data);

    void pop();

    boolean isEmpty();

    boolean isFull();
}

class StackIsOverflow extends Exception {
    public StackIsOverflow(String s) {
        super(s);
    }
}

class StackIsUnderflow extends Exception {
    public StackIsUnderflow(String s) {
        super(s);
    }
}

public class StackConcepts implements Stack {
    int top = -1;
    int elements[] = new int[5];

    public boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;

    }

    public boolean isFull() {
        if (top == elements.length - 1)
            return true;
        else
            return false;
    }

    public void push(int data) {
        try {
            if (!isFull())
                elements[++top] = data;
            else
                throw new StackIsOverflow(" Stack overflow ");
        } catch (StackIsOverflow e) {
            System.out.println("Excepion:" + e);
        }
    }

    public void pop() {
        try {
            if (!isEmpty())
                System.out.println("The popped element:" + elements[top--]);
            else
                throw new StackIsUnderflow("Stack is UnderFlow");
        } catch (StackIsUnderflow e) {
            System.out.println("UserDefined Exception:" + e);
        }
    }

    void display() {
        System.out.println("Stack Elements are...");
        for (int i = 0; i <= top; i++)
            System.out.println(elements[i]);
    }

    public static void main(String args[]) {
        StackConcepts c = new StackConcepts();
        Scanner obj = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            choice = obj.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data to be pushed");
                    c.push(obj.nextInt());
                    break;
                case 2:
                    c.pop();
                    break;
                case 3:
                    c.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter the valid choice try it once again:");
            }
            if (choice == 4)
                break;
        }
    }
}
