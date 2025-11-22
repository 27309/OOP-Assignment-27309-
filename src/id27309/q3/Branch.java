package id27309.q3;

public class Branch extends Bank {
    private String branchName;
    private String location;

    public Branch(int id, String createdDate, String updatedDate,
                  String bankName, String headOffice,
                  String branchName, String location)
            throws BankDataException {

        super(id, createdDate, updatedDate, bankName, headOffice);

        if (branchName == null || branchName.isEmpty())
            throw new BankDataException("Branch name is required");

        if (location == null || location.isEmpty())
            throw new BankDataException("Location is required");

        this.branchName = branchName;
        this.location = location;
    }

    public String getBranchName() { return branchName; }
    public String getLocation() { return location; }

    @Override
    public String toString() {
        return "Branch[name=" + branchName + ", location=" + location + "]";
    }
}
