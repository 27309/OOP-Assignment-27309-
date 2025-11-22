package id27309.q2;

public class Student extends Teacher {
    private String studentName;
    private int rollNumber;
    private String grade;
    private String contactNumber;

    public Student(int id, String createdDate, String updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String teacherPhone,
                   String studentName, int rollNumber, String grade, String contactNumber)
            throws SchoolDataException {

        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone);

        if (rollNumber <= 0)
            throw new SchoolDataException("Roll number must be > 0");

        if (!contactNumber.matches("\\d{10}"))
            throw new SchoolDataException("Contact must be 10 digits");

        if (grade == null || grade.isEmpty())
            throw new SchoolDataException("Grade cannot be empty");

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }

    public String getStudentName() { return studentName; }
    public int getRollNumber() { return rollNumber; }
    public String getGrade() { return grade; }
    public String getContactNumber() { return contactNumber; }

    @Override
    public String toString() {
        return "Student[name=" + studentName + ", roll=" + rollNumber +
                ", grade=" + grade + "]";
    }
}
