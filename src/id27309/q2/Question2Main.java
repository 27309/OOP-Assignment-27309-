package id27309.q2;
import java.util.Scanner;

public class Question2Main {
    public static final String ID = "27309";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== SCHOOL MANAGEMENT SYSTEM (Q2) ===");

            System.out.print("Entity ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Created date: ");
            String cdate = sc.nextLine();
            System.out.print("Updated date: ");
            String udate = sc.nextLine();

            System.out.print("School name: ");
            String sname = sc.nextLine();
            System.out.print("Address: ");
            String addr = sc.nextLine();
            System.out.print("Phone (10 digits): ");
            String phone = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Department name: ");
            String dname = sc.nextLine();
            System.out.print("Department code: ");
            String dcode = sc.nextLine();

            System.out.print("Teacher name: ");
            String tname = sc.nextLine();
            System.out.print("Subject: ");
            String subj = sc.nextLine();
            System.out.print("Teacher email: ");
            String temail = sc.nextLine();
            System.out.print("Teacher phone: ");
            String tphone = sc.nextLine();

            System.out.print("Student name: ");
            String stname = sc.nextLine();
            System.out.print("Roll number: ");
            int roll = Integer.parseInt(sc.nextLine());
            System.out.print("Grade: ");
            String grade = sc.nextLine();
            System.out.print("Contact: ");
            String contact = sc.nextLine();

            System.out.print("Course name: ");
            String cname = sc.nextLine();
            System.out.print("Course code: ");
            String ccode = sc.nextLine();
            System.out.print("Credit hours: ");
            int chours = Integer.parseInt(sc.nextLine());

            System.out.print("Exam name: ");
            String ename = sc.nextLine();
            System.out.print("Max marks: ");
            int max = Integer.parseInt(sc.nextLine());
            System.out.print("Exam date: ");
            String edate = sc.nextLine();

            System.out.print("Obtained marks: ");
            int obtained = Integer.parseInt(sc.nextLine());
            System.out.print("Remarks: ");
            String remarks = sc.nextLine();

            System.out.print("Tuition fee: ");
            double tfee = Double.parseDouble(sc.nextLine());
            System.out.print("Exam fee: ");
            double efee = Double.parseDouble(sc.nextLine());

            StudentRecord record = new StudentRecord(
                    id, cdate, udate,
                    sname, addr, phone, email,
                    dname, dcode,
                    tname, subj, temail, tphone,
                    stname, roll, grade, contact,
                    cname, ccode, chours,
                    ename, max, edate,
                    obtained, remarks,
                    tfee, efee
            );

            System.out.println("\nAverage Marks: " +
                    record.calculateAverageMarks() + "% | ID: " + ID);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " | ID: " + ID);
        }
    }
}
