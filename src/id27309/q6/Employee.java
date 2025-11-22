package id27309.q6;

public class Employee extends Department{
    private String employeeName;
    private String email;
    private String phone;

    public Employee(int id, String createdDate, String updatedDate,
                    String companyName, String address,
                    String departmentName, String departmentCode,
                    String employeeName, String email, String phone)
            throws EmployeeDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                departmentName, departmentCode);

        if (employeeName == null || employeeName.isEmpty())
            throw new EmployeeDataException("Employee name required");

        if (!email.contains("@"))
            throw new EmployeeDataException("Invalid email");

        if (!phone.matches("\\d{10}"))
            throw new EmployeeDataException("Phone number must be 10 digits");

        this.employeeName = employeeName;
        this.email = email;
        this.phone = phone;
    }

    public String getEmployeeName() { return employeeName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    @Override
    public String toString() {
        return "Employee[name=" + employeeName + "]";
    }
}
