import java.util.*;

class Welcome {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name");
        String s = obj.nextLine();
        System.out.println("WELCOME " + s);
    }
}
