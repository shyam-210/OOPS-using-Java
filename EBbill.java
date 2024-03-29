import java.util.Scanner;

public class EBbill {
    int EBNumber;
    String customerName;
    int previousMonthReading;
    int currentMonthReading;
    int numberOfUnitsConsumed;
    double charge;
    int typeEBConnection;

    void getCustomerDetails() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Customer Name:");
        customerName = obj.nextLine();
        System.out.println("Enter the Customer EB Number:");
        EBNumber = obj.nextInt();
        System.out.println("Enter the previous month EB reading");
        previousMonthReading = obj.nextInt();
        System.out.println("Enter the Current month EB reading");
        currentMonthReading = obj.nextInt();
        System.out.println("Enter the type of EB Connection (Domestic -1 / Commercial -2 )");
        typeEBConnection = obj.nextInt();
    }

    void eBillCal() {
        numberOfUnitsConsumed = currentMonthReading - previousMonthReading;
        if (typeEBConnection == 1) {
            if (numberOfUnitsConsumed < 101)
                charge = numberOfUnitsConsumed * 1;
            else if (numberOfUnitsConsumed > 100 && numberOfUnitsConsumed < 201)
                charge = 100 + (numberOfUnitsConsumed - 100) * 2.5;
            else if (numberOfUnitsConsumed > 200 && numberOfUnitsConsumed < 501)
                charge = 100 + 100 * 2.5 + (numberOfUnitsConsumed - 200) * 4;
            else
                charge = 100 + 100 * 2.5 + 300 * 4 + (numberOfUnitsConsumed - 500) * 6;
        } else {
            if (numberOfUnitsConsumed < 101)
                charge = numberOfUnitsConsumed * 2;
            else if (numberOfUnitsConsumed > 100 && numberOfUnitsConsumed < 201)
                charge = 100 + (numberOfUnitsConsumed - 100) * 4.5;
            else if (numberOfUnitsConsumed > 200 && numberOfUnitsConsumed < 501)
                charge = 100 + 100 * 4.5 + (numberOfUnitsConsumed - 200) * 6;
            else
                charge = 100 + 100 * 2.5 + 300 * 4 + (numberOfUnitsConsumed - 500) * 7;
        }
    }

    void display() {
        String con = (typeEBConnection == 1) ? "Domestic" : "Commercial";
        System.out.println("------------------EB Bill Details	");
        System.out.println(" 					");
        System.out.println("Customer Name	:" + customerName);
        System.out.println("Customer EB Number			:" + EBNumber);
        System.out.println("Previous Month Reading			:" + previousMonthReading);
        System.out.println("Current Month Reading		:" + currentMonthReading);
        System.out.println("Number of Units Consumed			:" + numberOfUnitsConsumed);
        System.out.println("Type of EB Connection		:" + con);
        System.out.println("EB Charge	:" + charge);
        System.out.println(" 		");
    }

    public static void main(String[] args) {

        EBbill e = new EBbill();
        e.getCustomerDetails();
        e.eBillCal();
        e.display();

    }
}
