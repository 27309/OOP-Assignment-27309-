package id27309.q4;
import java.util.Scanner;

public class Question4Main {
    public static final String ID = "27309";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== LIBRARY MANAGEMENT SYSTEM (Q4) ===");

            System.out.print("Entity ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Created date: ");
            String cdate = sc.nextLine();
            System.out.print("Updated date: ");
            String udate = sc.nextLine();

            System.out.print("Library name: ");
            String lname = sc.nextLine();
            System.out.print("Location: ");
            String loc = sc.nextLine();

            System.out.print("Section name: ");
            String sname = sc.nextLine();
            System.out.print("Category: ");
            String cat = sc.nextLine();

            System.out.print("Librarian name: ");
            String libname = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Member name: ");
            String mname = sc.nextLine();
            System.out.print("Membership ID: ");
            int mid = Integer.parseInt(sc.nextLine());
            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Book title: ");
            String btitle = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("ISBN: ");
            String isbn = sc.nextLine();

            System.out.print("Borrow date: ");
            String bdate = sc.nextLine();
            System.out.print("Return date: ");
            String rdate = sc.nextLine();

            System.out.print("Days late: ");
            int days = Integer.parseInt(sc.nextLine());
            System.out.print("Fine per day: ");
            double fpd = Double.parseDouble(sc.nextLine());

            LibraryRecord record = new LibraryRecord(
                    id, cdate, udate,
                    lname, loc,
                    sname, cat,
                    libname, email,
                    mname, mid, phone,
                    btitle, author, isbn,
                    bdate, rdate,
                    days, fpd
            );

            System.out.println("\nTotal Fine: " +
                    record.calculateTotalFine() + " | ID: " + ID);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " | ID: " + ID);
        }
    }
}
