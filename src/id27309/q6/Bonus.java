package id27309.q6;

public class Bonus extends Promotion{
    private double bonusAmount;

    public Bonus(int id, String createdDate, String updatedDate,
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
                promoted);

        if (bonusAmount < 0)
            throw new EmployeeDataException("Bonus cannot be negative");

        this.bonusAmount = bonusAmount;
    }

    public double getBonusAmount() { return bonusAmount; }

    @Override
    public String toString() {
        return "Bonus[amount=" + bonusAmount + "]";
    }
}
