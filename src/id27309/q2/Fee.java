package id27309.q2;

public class Fee extends Result{
    private double tuitionFee;
    private double examFee;
    private double totalFee;

    public Fee(int id, String createdDate, String updatedDate,
               String schoolName, String address, String phoneNumber, String email,
               String departmentName, String departmentCode,
               String teacherName, String subject, String teacherEmail, String teacherPhone,
               String studentName, int rollNumber, String grade, String contactNumber,
               String courseName, String courseCode, int creditHours,
               String examName, int maxMarks, String examDate,
               int obtainedMarks, String remarks,
               double tuitionFee, double examFee)
            throws SchoolDataException {

        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours,
                examName, maxMarks, examDate,
                obtainedMarks, remarks);

        if (tuitionFee <= 0)
            throw new SchoolDataException("Tuition fee must be > 0");

        if (examFee <= 0)
            throw new SchoolDataException("Exam fee must be > 0");

        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
    }

    public double getTuitionFee() { return tuitionFee; }
    public double getExamFee() { return examFee; }

    @Override
    public String toString() {
        return "Fee[tuition=" + tuitionFee + ", examFee=" + examFee + "]";
    }
}
