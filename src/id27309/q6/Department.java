package id27309.q6;

public class Department extends Company{
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String companyName, String address,
                      String departmentName, String departmentCode)
            throws EmployeeDataException {

        super(id, createdDate, updatedDate, companyName, address);

        if (departmentName == null || departmentName.isEmpty())
            throw new EmployeeDataException("Department name required");

        if (!departmentCode.matches("[A-Za-z0-9]{3,}"))
            throw new EmployeeDataException("Department code must be 3+ alphanumeric characters");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }

    @Override
    public String toString() {
        return "Department[name=" + departmentName + "]";
    }
}
