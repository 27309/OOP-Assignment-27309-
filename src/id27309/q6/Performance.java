package id27309.q6;

public class Performance extends Attendance{
    private int performanceScore; // 1–100

    public Performance(int id, String createdDate, String updatedDate,
                       String companyName, String address,
                       String departmentName, String departmentCode,
                       String employeeName, String email, String phone,
                       double basicSalary,
                       int daysPresent,
                       int performanceScore)
            throws EmployeeDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                departmentName, departmentCode,
                employeeName, email, phone,
                basicSalary,
                daysPresent);

        if (performanceScore < 0 || performanceScore > 100)
            throw new EmployeeDataException("Performance score must be 0–100");

        this.performanceScore = performanceScore;
    }

    public int getPerformanceScore() { return performanceScore; }

    @Override
    public String toString() {
        return "Performance[score=" + performanceScore + "]";
    }
}
