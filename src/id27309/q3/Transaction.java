package id27309.q3;

public class Transaction extends SavingsAccount{
    private double amount;
    private String type;

    public Transaction(int id, String createdDate, String updatedDate,
                       String bankName, String headOffice,
                       String branchName, String location,
                       String managerName, String managerEmail,
                       String accountNumber, double balance,
                       double interestRate,
                       double amount, String type)
            throws BankDataException {

        super(id, createdDate, updatedDate,
                bankName, headOffice, branchName, location,
                managerName, managerEmail,
                accountNumber, balance,
                interestRate);

        if (amount <= 0)
            throw new BankDataException("Transaction amount must be > 0");

        if (!(type.equals("deposit") || type.equals("withdraw")))
            throw new BankDataException("Type must be deposit or withdraw");

        this.amount = amount;
        this.type = type;
    }

    public double getAmount() { return amount; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "Transaction[type=" + type + ", amount=" + amount + "]";
    }
}
