package id27309.q9;

public class Withdrawal extends Deposit{
    private double withdrawalAmount;

    public Withdrawal(int id, String createdDate, String updatedDate,
                      String bankName, String headOffice,
                      String branchName, String branchCode,
                      String accountNumber, String accountType,
                      String customerName, String phone,
                      double depositAmount,
                      double withdrawalAmount)
            throws BankDataException {

        super(id, createdDate, updatedDate,
                bankName, headOffice,
                branchName, branchCode,
                accountNumber, accountType,
                customerName, phone,
                depositAmount);

        if (withdrawalAmount < 0)
            throw new BankDataException("Withdrawal cannot be negative");

        this.withdrawalAmount = withdrawalAmount;
    }

    public double getWithdrawalAmount() { return withdrawalAmount; }
}
