package id27309.q1;
import java.util.Scanner;

public class Question1Main {
    private static final String ID = "27309";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== Hospital Management System (Q1) ===");

            System.out.print("Entity ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Created date: ");
            String cdate = sc.nextLine();
            System.out.print("Updated date: ");
            String udate = sc.nextLine();
            Entity entity = new Entity(id, cdate, udate);

            System.out.print("Hospital name: ");
            String hname = sc.nextLine();
            System.out.print("Address: ");
            String addr = sc.nextLine();
            System.out.print("Phone (10 digits): ");
            String phone = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            Hospital hospital = new Hospital(id, cdate, udate, hname, addr, phone, email);

            System.out.print("Department name: ");
            String dname = sc.nextLine();
            System.out.print("Department code: ");
            String dcode = sc.nextLine();
            Department dept = new Department(id, cdate, udate, hname, addr, phone, email, dname, dcode);

            System.out.print("Doctor name: ");
            String docName = sc.nextLine();
            System.out.print("Specialization: ");
            String spec = sc.nextLine();
            System.out.print("Doctor email: ");
            String docEmail = sc.nextLine();
            System.out.print("Doctor phone: ");
            String docPhone = sc.nextLine();
            Doctor doctor = new Doctor(id, cdate, udate, hname, addr, phone, email,
                    dname, dcode, docName, spec, docEmail, docPhone);

            System.out.print("Nurse name: ");
            String nurseName = sc.nextLine();
            System.out.print("Shift (Day/Night): ");
            String shift = sc.nextLine();
            System.out.print("Years of experience: ");
            int exp = Integer.parseInt(sc.nextLine());
            Nurse nurse = new Nurse(id, cdate, udate, hname, addr, phone, email,
                    dname, dcode, docName, spec, docEmail, docPhone,
                    nurseName, shift, exp);

            System.out.print("Patient name: ");
            String pname = sc.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Contact number: ");
            String contact = sc.nextLine();
            Patient patient = new Patient(id, cdate, udate, hname, addr, phone, email,
                    dname, dcode, docName, spec, docEmail, docPhone,
                    nurseName, shift, exp, pname, age, gender, contact);

            System.out.print("Admission date: ");
            String adate = sc.nextLine();
            System.out.print("Room number: ");
            String rnum = sc.nextLine();
            System.out.print("Room charges: ");
            double rcharge = Double.parseDouble(sc.nextLine());
            Admission admission = new Admission(id, cdate, udate, hname, addr, phone, email,
                    dname, dcode, docName, spec, docEmail, docPhone,
                    nurseName, shift, exp, pname, age, gender, contact,
                    adate, rnum, rcharge);

            System.out.print("Diagnosis: ");
            String diag = sc.nextLine();
            System.out.print("Treatment given: ");
            String treat = sc.nextLine();
            System.out.print("Treatment cost: ");
            double tcost = Double.parseDouble(sc.nextLine());
            Treatment t = new Treatment(id, cdate, udate, hname, addr, phone, email,
                    dname, dcode, docName, spec, docEmail, docPhone,
                    nurseName, shift, exp, pname, age, gender, contact,
                    adate, rnum, rcharge,
                    diag, treat, tcost);

            System.out.print("Doctor fee: ");
            double docFee = Double.parseDouble(sc.nextLine());
            System.out.print("Medicine cost: ");
            double medCost = Double.parseDouble(sc.nextLine());
            Bill bill = new Bill(id, cdate, udate, hname, addr, phone, email,
                    dname, dcode, docName, spec, docEmail, docPhone,
                    nurseName, shift, exp, pname, age, gender, contact,
                    adate, rnum, rcharge,
                    diag, treat, tcost,
                    docFee, medCost);

            HospitalRecord hr = new HospitalRecord(id, cdate, udate, hname, addr, phone, email,
                    dname, dcode, docName, spec, docEmail, docPhone,
                    nurseName, shift, exp, pname, age, gender, contact,
                    adate, rnum, rcharge,
                    diag, treat, tcost,
                    docFee, medCost);

            double finalBill = hr.generateBill();

            System.out.println("\nFINAL BILL: " + finalBill + " | ID: " + ID);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " | ID: " + ID);
        }
    }
}
