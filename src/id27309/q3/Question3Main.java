package id27309.q3;
import java.util.Scanner;

public class Question3Main {
    public static final String ID = "27309";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== BANK MANAGEMENT SYSTEM (Q3) ===");

            System.out.print("Entity ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Created date: ");
            String cdate = sc.nextLine();
            System.out.print("Updated date: ");
            String udate = sc.nextLine();

            System.out.print("Bank name: ");
            String bankName = sc.nextLine();
            System.out.print("Head office: ");
            String hq = sc.nextLine();

            System.out.print("Branch name: ");
            String bname = sc.nextLine();
            System.out.print("Location: ");
            String location = sc.nextLine();

            System.out.print("Manager name: ");
            String mname = sc.nextLine();
            System.out.print("Manager email: ");
            String memail = sc.nextLine();

            System.out.print("Account number: ");
            String accNum = sc.nextLine();
            System.out.print("Balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            System.out.print("Interest rate: ");
            double rate = Double.parseDouble(sc.nextLine());

            System.out.print("Transaction amount: ");
            double amount = Double.parseDouble(sc.nextLine());
            System.out.print("Transaction type (deposit/withdraw): ");
            String type = sc.nextLine();

            System.out.print("Loan amount: ");
            double loan = Double.parseDouble(sc.nextLine());
            System.out.print("Monthly interest: ");
            double min = Double.parseDouble(sc.nextLine());

            BankRecord record = new BankRecord(
                    id, cdate, udate,
                    bankName, hq,
                    bname, location,
                    mname, memail,
                    accNum, balance,
                    rate,
                    amount, type,
                    loan, min
            );

            System.out.println("\nTotal Loan Payment: " +
                    record.calculateTotalLoanPayment() + " | ID: " + ID);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " | ID: " + ID);
        }
    }
}
