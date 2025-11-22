package id27309.q6;

public class Salary extends Employee{
    private double basicSalary;

    public Salary(int id, String createdDate, String updatedDate,
                  String companyName, String address,
                  String departmentName, String departmentCode,
                  String employeeName, String email, String phone,
                  double basicSalary)
            throws EmployeeDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                departmentName, departmentCode,
                employeeName, email, phone);

        if (basicSalary <= 0)
            throw new EmployeeDataException("Basic salary must be > 0");

        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() { return basicSalary; }

    @Override
    public String toString() {
        return "Salary[basic=" + basicSalary + "]";
    }
}
