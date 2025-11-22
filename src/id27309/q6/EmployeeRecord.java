package id27309.q6;

public class EmployeeRecord extends Bonus{
    public EmployeeRecord(int id, String createdDate, String updatedDate,
                          String companyName, String address,
                          String departmentName, String departmentCode,
                          String employeeName, String email, String phone,
                          double basicSalary,
                          int daysPresent,
                          int performanceScore,
                          boolean promoted,
                          double bonusAmount)
            throws EmployeeDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                departmentName, departmentCode,
                employeeName, email, phone,
                basicSalary,
                daysPresent,
                performanceScore,
                promoted,
                bonusAmount);
    }

    public double calculateTotalSalary() {
        // Bonus is added only if promoted
        return getBasicSalary() + (isPromoted() ? getBonusAmount() : 0);
    }
}
