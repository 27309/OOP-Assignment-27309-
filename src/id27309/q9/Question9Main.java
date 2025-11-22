package id27309.q9;
import java.util.Scanner;
public class Question9Main {
    public static final String ID = "27309";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== BANKING MANAGEMENT SYSTEM (Q9) ===");

            System.out.print("Entity ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Created Date: ");
            String cdate = sc.nextLine();
            System.out.print("Updated Date: ");
            String udate = sc.nextLine();

            System.out.print("Bank Name: ");
            String bname = sc.nextLine();
            System.out.print("Head Office: ");
            String hoffice = sc.nextLine();

            System.out.print("Branch Name: ");
            String brname = sc.nextLine();
            System.out.print("Branch Code: ");
            String brcode = sc.nextLine();

            System.out.print("Account Number (10 digits): ");
            String accNum = sc.nextLine();
            System.out.print("Account Type: ");
            String accType = sc.nextLine();

            System.out.print("Customer Name: ");
            String cname = sc.nextLine();
            System.out.print("Phone (10 digits): ");
            String phone = sc.nextLine();

            System.out.print("Deposit Amount: ");
            double deposit = Double.parseDouble(sc.nextLine());
            System.out.print("Withdrawal Amount: ");
            double withdrawal = Double.parseDouble(sc.nextLine());
            System.out.print("Transfer Amount: ");
            double transfer = Double.parseDouble(sc.nextLine());
            System.out.print("Transaction Fee: ");
            double fee = Double.parseDouble(sc.nextLine());

            BankRecord record = new BankRecord(
                    id, cdate, udate,
                    bname, hoffice,
                    brname, brcode,
                    accNum, accType,
                    cname, phone,
                    deposit, withdrawal, transfer, fee
            );

            System.out.println("\nFinal Balance: " +
                    record.calculateBalance() + " | ID: " + ID);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " | ID: " + ID);
        }
    }

}
