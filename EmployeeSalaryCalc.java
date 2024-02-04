import java.util.Scanner;

public class EmployeeSalaryCalc {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        Programmer p = new Programmer();
        System.out.println("Enter the basic pay of Programmer");
        p.getEmployeeDetails(obj.nextDouble());
        p.cal();
        AssistantProfessor ap = new AssistantProfessor();
        System.out.println("Enter the basic pay of Assistant Professor");
        ap.getEmployeeDetails(obj.nextDouble());
        ap.cal();
        AssociateProfessor asp = new AssociateProfessor();
        System.out.println("Enter the basic pay of Associate Professor");
        asp.getEmployeeDetails(obj.nextDouble());
        asp.cal();
        Professor prof = new Professor();
        System.out.println("Enter the basic pay of Professor");
        prof.getEmployeeDetails(obj.nextDouble());
        prof.cal();
    }
}

class Employee {
    String employeeName;
    int employeeID;
    String address;
    String mailID;
    long mobileNumber;
    double da, hra, pf, sc, ns, gs;
    Scanner obj = new Scanner(System.in);

    void getEmployeeDetails() {
        System.out.println("Enter the Employee Name:");
        employeeName = obj.nextLine();
        System.out.println("Enter the Employee Address:");
        address = obj.nextLine();
        System.out.println("Enter the Employee Mail ID:");
        mailID = obj.nextLine();
        System.out.println("Enter the Employee ID:");
        employeeID = obj.nextInt();
        System.out.println("Enter the Employee Mobile Number:");
        mobileNumber = obj.nextLong();
    }

    void display() {
        System.out.println("Employee Name		:" + employeeName);
        System.out.println("Employee ID	:" + employeeID);
        System.out.println("Employee Address			:" + address);
        System.out.println("Employee Mail ID		:" + mailID);
        System.out.println("Employee Mobile Number:" + mobileNumber);
    }
}

class Programmer extends Employee {
    double basicPay;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    void getEmployeeDetails(double bp) {
        super.getEmployeeDetails();
        setBasicPay(bp);
    }

    void cal() {
        da = getBasicPay() * 97 / 100.0;
        hra = getBasicPay() * 10 / 100.0;
        pf = getBasicPay() * 12 / 100.0;
        sc = getBasicPay() * 1 / 100.0;
        gs = getBasicPay() + da + hra + pf + sc;
        ns = gs - pf - sc;
        display();
    }

    void display() {
        super.display();
        System.out.println("Employee Gross Salary:" + gs);
        System.out.println("Employee Net Salary :" + ns);
    }
}

class AssistantProfessor extends Employee {
    double basicPay;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    void getEmployeeDetails(double bp) {
        super.getEmployeeDetails();
        setBasicPay(bp);
    }

    void cal() {
        da = getBasicPay() * 110 / 100.0;
        hra = getBasicPay() * 20 / 100.0;
        pf = getBasicPay() * 12 / 100.0;
        sc = getBasicPay() * 5 / 100.0;
        gs = getBasicPay() + da + hra + pf + sc;
        ns = gs - pf - sc;
        display();
    }

    void display() {
        super.display();
        System.out.println("Employee Gross Salary:" + gs);
        System.out.println("Employee Net Salary :" + ns);
    }
}

class AssociateProfessor extends Employee {
    double basicPay;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    void getEmployeeDetails(double bp) {
        super.getEmployeeDetails();
        setBasicPay(bp);
    }

    void cal() {
        da = getBasicPay() * 130 / 100.0;
        hra = getBasicPay() * 30 / 100.0;
        pf = getBasicPay() * 12 / 100.0;
        sc = getBasicPay() * 10 / 100.0;
        gs = getBasicPay() + da + hra + pf + sc;
        ns = gs - pf - sc;
        display();
    }

    void display() {
        super.display();
        System.out.println("Employee Gross Salary:" + gs);
        System.out.println("Employee Net Salary :" + ns);
    }
}

class Professor extends Employee {
    double basicPay;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    void getEmployeeDetails(double bp) {
        super.getEmployeeDetails();
        setBasicPay(bp);
    }

    void cal() {
        da = getBasicPay() * 140 / 100.0;
        hra = getBasicPay() * 40 / 100.0;
        pf = getBasicPay() * 12 / 100.0;
        sc = getBasicPay() * 15 / 100.0;
        gs = getBasicPay() + da + hra + pf + sc;
        ns = gs - pf - sc;
        display();
    }

    void display() {
        super.display();
        System.out.println("Employee Gross Salary:" + gs);
        System.out.println("Employee Net Salary :" + ns);
    }
}
