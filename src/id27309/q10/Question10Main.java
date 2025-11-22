package id27309.q10;
import java.util.Scanner;
public class Question10Main {
    public static final String ID = "27309";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== HOTEL MANAGEMENT SYSTEM (Q10) ===");

            System.out.print("Entity ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Created Date: ");
            String cdate = sc.nextLine();
            System.out.print("Updated Date: ");
            String udate = sc.nextLine();

            System.out.print("Hotel Name: ");
            String hname = sc.nextLine();
            System.out.print("Location: ");
            String loc = sc.nextLine();

            System.out.print("Room Number: ");
            String rnum = sc.nextLine();
            System.out.print("Room Type: ");
            String rtype = sc.nextLine();
            System.out.print("Room Price: ");
            double rprice = Double.parseDouble(sc.nextLine());

            System.out.print("Guest Name: ");
            String gname = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Booking Date: ");
            String bdate = sc.nextLine();
            System.out.print("Check-In Date: ");
            String cidate = sc.nextLine();
            System.out.print("Check-Out Date: ");
            String codate = sc.nextLine();

            System.out.print("Service Charge: ");
            double charge = Double.parseDouble(sc.nextLine());
            System.out.print("Nights Stayed: ");
            int nights = Integer.parseInt(sc.nextLine());

            HotelRecord record = new HotelRecord(
                    id, cdate, udate,
                    hname, loc,
                    rnum, rtype, rprice,
                    gname, phone,
                    bdate,
                    cidate,
                    codate,
                    charge,
                    nights
            );

            System.out.println("\nTotal Bill: " +
                    record.calculateTotal() + " | ID: " + ID);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " | ID: " + ID);
        }
    }
}
