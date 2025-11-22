package id27309.q6;

public class Promotion extends Performance{
    private boolean promoted;

    public Promotion(int id, String createdDate, String updatedDate,
                     String companyName, String address,
                     String departmentName, String departmentCode,
                     String employeeName, String email, String phone,
                     double basicSalary,
                     int daysPresent,
                     int performanceScore,
                     boolean promoted)
            throws EmployeeDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                departmentName, departmentCode,
                employeeName, email, phone,
                basicSalary,
                daysPresent,
                performanceScore);

        this.promoted = promoted;
    }

    public boolean isPromoted() { return promoted; }

    @Override
    public String toString() {
        return "Promotion[promoted=" + promoted + "]";
    }
}
