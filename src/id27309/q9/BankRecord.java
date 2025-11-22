package id27309.q9;

public class BankRecord extends TransactionFee{
    public BankRecord(int id, String createdDate, String updatedDate,
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
                transferAmount,
                fee);
    }

    public double calculateBalance() {
        return getDepositAmount()
                - getWithdrawalAmount()
                - getTransferAmount()
                - getFee();
    }
}
