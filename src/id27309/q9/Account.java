package id27309.q9;

public class Account extends Branch{
    private String accountNumber;
    private String accountType;

    public Account(int id, String createdDate, String updatedDate,
                   String bankName, String headOffice,
                   String branchName, String branchCode,
                   String accountNumber, String accountType)
            throws BankDataException {

        super(id, createdDate, updatedDate,
                bankName, headOffice,
                branchName, branchCode);

        if (!accountNumber.matches("[0-9]{10}"))
            throw new BankDataException("Account number must be 10 digits");

        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public String getAccountNumber() { return accountNumber; }
}
