import java.util.Scanner;

public class SumFirstN {
    int calculate(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    public static void main(String arg[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Limit (N):");
        int n = obj.nextInt();
        SumFirstN s = new SumFirstN();
        System.out.println("The sum of First N Natural number is:" + s.calculate(n));
    }
}
