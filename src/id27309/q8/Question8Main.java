package id27309.q8;
import java.util.Scanner;
public class Question8Main {
    public static final String ID = "27309";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(" LIBRARY MANAGEMENT SYSTEM ");

            System.out.print("Entity ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Created Date: ");
            String cdate = sc.nextLine();
            System.out.print("Updated Date: ");
            String udate = sc.nextLine();

            System.out.print("Library Name: ");
            String lname = sc.nextLine();
            System.out.print("Location: ");
            String loc = sc.nextLine();

            System.out.print("Section Name: ");
            String sname = sc.nextLine();
            System.out.print("Section Code: ");
            String scode = sc.nextLine();

            System.out.print("Book Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("ISBN (10-13 digits): ");
            String isbn = sc.nextLine();

            System.out.print("Member Name: ");
            String mname = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Borrow Date: ");
            String bdate = sc.nextLine();
            System.out.print("Return Date: ");
            String rdate = sc.nextLine();

            System.out.print("Late Days: ");
            int ldays = Integer.parseInt(sc.nextLine());
            System.out.print("Fine Rate per Day: ");
            double rate = Double.parseDouble(sc.nextLine());
            System.out.print("Amount Paid: ");
            double paid = Double.parseDouble(sc.nextLine());

            LibraryRecord record = new LibraryRecord(
                    id, cdate, udate,
                    lname, loc,
                    sname, scode,
                    title, author, isbn,
                    mname, phone,
                    bdate, rdate,
                    ldays, rate,
                    paid
            );

            System.out.println("\nBalance: " +
                    record.calculateBalance() + " | ID: " + ID);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " | ID: " + ID);
        }
    }
}
