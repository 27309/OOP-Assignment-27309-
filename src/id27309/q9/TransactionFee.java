package id27309.q9;

public class TransactionFee extends Transfer{
    private double fee;

    public TransactionFee(int id, String createdDate, String updatedDate,
                          String bankName, String headOffice,
                          String branchName, String branchCode,
                          String accountNumber, String accountType,
                          String customerName, String phone,
                          double depositAmount,
                          double withdrawalAmount,
                          double transferAmount,
                          double fee)
            throws BankDataException {

        super(id, createdDate, updatedDate,
                bankName, headOffice,
                branchName, branchCode,
                accountNumber, accountType,
                customerName, phone,
                depositAmount,
                withdrawalAmount,
                transferAmount);

        if (fee < 0)
            throw new BankDataException("Fee cannot be negative");

        this.fee = fee;
    }

    public double getFee() { return fee; }
}
