package id27309.q7;
import java.util.Scanner;

public class Question7Main {
    public static final String ID = "27309";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== TRANSPORT MANAGEMENT SYSTEM (Q7) ===");

            System.out.print("Entity ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Created Date: ");
            String cdate = sc.nextLine();
            System.out.print("Updated Date: ");
            String udate = sc.nextLine();

            System.out.print("Company Name: ");
            String cname = sc.nextLine();
            System.out.print("Address: ");
            String addr = sc.nextLine();

            System.out.print("Vehicle Number: ");
            String vnum = sc.nextLine();
            System.out.print("Vehicle Type: ");
            String vtype = sc.nextLine();
            System.out.print("Capacity: ");
            int cap = Integer.parseInt(sc.nextLine());

            System.out.print("Driver Name: ");
            String dname = sc.nextLine();
            System.out.print("License Number: ");
            String lic = sc.nextLine();

            System.out.print("Start Location: ");
            String start = sc.nextLine();
            System.out.print("Destination: ");
            String dest = sc.nextLine();
            System.out.print("Distance (km): ");
            int dist = Integer.parseInt(sc.nextLine());

            System.out.print("Trip Date: ");
            String tdate = sc.nextLine();

            System.out.print("Passenger Name: ");
            String pname = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Ticket Price: ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.print("Amount Paid: ");
            double paid = Double.parseDouble(sc.nextLine());

            TransportRecord record = new TransportRecord(
                    id, cdate, udate,
                    cname, addr,
                    vnum, vtype, cap,
                    dname, lic,
                    start, dest, dist,
                    tdate,
                    pname, phone,
                    price, paid
            );

            System.out.println("\nChange to Return: " +
                    record.calculateChange() + " | ID: " + ID);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " | ID: " + ID);
        }
    }
}
