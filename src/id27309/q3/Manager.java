package id27309.q3;

public class Manager extends Branch {

    private String managerName;
    private String managerEmail;

    public Manager(int id, String createdDate, String updatedDate,
                   String bankName, String headOffice,
                   String branchName, String location,
                   String managerName, String managerEmail)
            throws BankDataException {

        super(id, createdDate, updatedDate, bankName, headOffice, branchName, location);

        if (managerName == null || managerName.isEmpty())
            throw new BankDataException("Manager name is required");

        if (!managerEmail.contains("@"))
            throw new BankDataException("Invalid manager email");

        this.managerName = managerName;
        this.managerEmail = managerEmail;
    }

    public String getManagerName() { return managerName; }
    public String getManagerEmail() { return managerEmail; }

    @Override
    public String toString() {
        return "Manager[name=" + managerName + "]";
    }
}
