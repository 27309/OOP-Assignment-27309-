package id27309.q9;

public class Branch extends Bank{
    private String branchName;
    private String branchCode;

    public Branch(int id, String createdDate, String updatedDate,
                  String bankName, String headOffice,
                  String branchName, String branchCode)
            throws BankDataException {

        super(id, createdDate, updatedDate, bankName, headOffice);

        if (branchName == null || branchName.isEmpty())
            throw new BankDataException("Branch name required");

        if (!branchCode.matches("[A-Z0-9]{3,}"))
            throw new BankDataException("Branch code must be 3+ alphanumeric chars");

        this.branchName = branchName;
        this.branchCode = branchCode;
    }
}
