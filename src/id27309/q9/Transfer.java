package id27309.q9;

public class Transfer extends Withdrawal{
    private double transferAmount;

    public Transfer(int id, String createdDate, String updatedDate,
                    String bankName, String headOffice,
                    String branchName, String branchCode,
                    String accountNumber, String accountType,
                    String customerName, String phone,
                    double depositAmount,
                    double withdrawalAmount,
                    double transferAmount)
            throws BankDataException {

        super(id, createdDate, updatedDate,
                bankName, headOffice,
                branchName, branchCode,
                accountNumber, accountType,
                customerName, phone,
                depositAmount,
                withdrawalAmount);

        if (transferAmount < 0)
            throw new BankDataException("Transfer amount cannot be negative");

        this.transferAmount = transferAmount;
    }

    public double getTransferAmount() { return transferAmount; }
}
