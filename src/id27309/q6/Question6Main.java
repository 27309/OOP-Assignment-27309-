package id27309.q6;
import java.util.Scanner;

public class Question6Main {
    public static final String ID = "27309";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== EMPLOYEE MANAGEMENT SYSTEM (Q6) ===");

            System.out.print("Entity ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Created date: ");
            String cdate = sc.nextLine();

            System.out.print("Updated date: ");
            String udate = sc.nextLine();

            System.out.print("Company name: ");
            String comp = sc.nextLine();

            System.out.print("Company address: ");
            String addr = sc.nextLine();

            System.out.print("Department name: ");
            String dname = sc.nextLine();

            System.out.print("Department code: ");
            String dcode = sc.nextLine();

            System.out.print("Employee name: ");
            String ename = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Phone (10 digits): ");
            String phone = sc.nextLine();

            System.out.print("Basic salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            System.out.print("Days present: ");
            int days = Integer.parseInt(sc.nextLine());

            System.out.print("Performance score (0-100): ");
            int score = Integer.parseInt(sc.nextLine());

            System.out.print("Promoted? (true/false): ");
            boolean promoted = Boolean.parseBoolean(sc.nextLine());

            System.out.print("Bonus amount: ");
            double bonus = Double.parseDouble(sc.nextLine());

            EmployeeRecord record = new EmployeeRecord(
                    id, cdate, udate,
                    comp, addr,
                    dname, dcode,
                    ename, email, phone,
                    salary,
                    days,
                    score,
                    promoted,
                    bonus
            );

            System.out.println("\nTotal Salary: " +
                    record.calculateTotalSalary() + " | ID: " + ID);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " | ID: " + ID);
        }
    }
}
