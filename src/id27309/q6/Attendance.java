package id27309.q6;

public class Attendance extends Salary{
    private int daysPresent;

    public Attendance(int id, String createdDate, String updatedDate,
                      String companyName, String address,
                      String departmentName, String departmentCode,
                      String employeeName, String email, String phone,
                      double basicSalary,
                      int daysPresent)
            throws EmployeeDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                departmentName, departmentCode,
                employeeName, email, phone,
                basicSalary);

        if (daysPresent < 0 || daysPresent > 31)
            throw new EmployeeDataException("Days present must be between 0 and 31");

        this.daysPresent = daysPresent;
    }

    public int getDaysPresent() { return daysPresent; }

    @Override
    public String toString() {
        return "Attendance[daysPresent=" + daysPresent + "]";
    }
}
