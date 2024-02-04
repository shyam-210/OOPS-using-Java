import java.util.Scanner;

public class VoterDemo {
    int age;
    String name;

    void getVoterDetails() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Person Name:");
        name = obj.nextLine();
        System.out.println("Enter the Person Age:");
        age = obj.nextInt();
    }

    void checkEligible() {
        if (age >= 18)
            System.out.println(name + " is eligible to Vote");
        else
            System.out.println(name + " is not eligible to Vote");
    }

    public static void main(String args[]) {
        VoterDemo v = new VoterDemo();
        v.getVoterDetails();
        v.checkEligible();
    }
}
