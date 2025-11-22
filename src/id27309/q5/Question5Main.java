package id27309.q5;
import java.util.Scanner;
public class Question5Main {
    public static final String ID = "27309";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== HOTEL MANAGEMENT SYSTEM (Q5) ===");

            System.out.print("Entity ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Created Date: ");
            String cdate = sc.nextLine();
            System.out.print("Updated Date: ");
            String udate = sc.nextLine();

            System.out.print("Hotel Name: ");
            String hotelName = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Room Number: ");
            String roomNumber = sc.nextLine();
            System.out.print("Room Type: ");
            String roomType = sc.nextLine();
            System.out.print("Price per Night: ");
            double ppn = Double.parseDouble(sc.nextLine());

            System.out.print("Customer Name: ");
            String cname = sc.nextLine();
            System.out.print("Phone (10 digits): ");
            String phone = sc.nextLine();

            System.out.print("Check In Date: ");
            String in = sc.nextLine();
            System.out.print("Check Out Date: ");
            String out = sc.nextLine();
            System.out.print("Nights: ");
            int nights = Integer.parseInt(sc.nextLine());

            System.out.print("Room Cost: ");
            double rcost = Double.parseDouble(sc.nextLine());

            System.out.print("Food Bill: ");
            double fbill = Double.parseDouble(sc.nextLine());

            System.out.print("Service Charge: ");
            double scharge = Double.parseDouble(sc.nextLine());

            HotelRecord record = new HotelRecord(
                    id, cdate, udate,
                    hotelName, address,
                    roomNumber, roomType, ppn,
                    cname, phone,
                    in, out, nights,
                    rcost, fbill, scharge
            );

            System.out.println("\nTotal Bill: " +
                    record.calculateTotalBill() + " | ID: " + ID);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " | ID: " + ID);
        }
    }
}
