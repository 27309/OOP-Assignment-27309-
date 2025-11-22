package id27309.q9;

public class Deposit extends Customer{
    private double depositAmount;

    public Deposit(int id, String createdDate, String updatedDate,
                   String bankName, String headOffice,
                   String branchName, String branchCode,
                   String accountNumber, String accountType,
                   String customerName, String phone,
                   double depositAmount)
            throws BankDataException {

        super(id, createdDate, updatedDate,
                bankName, headOffice,
                branchName, branchCode,
                accountNumber, accountType,
                customerName, phone);

        if (depositAmount <= 0)
            throw new BankDataException("Deposit amount must be positive");

        this.depositAmount = depositAmount;
    }

    public double getDepositAmount() { return depositAmount; }
}
