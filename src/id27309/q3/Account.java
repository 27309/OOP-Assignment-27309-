package id27309.q3;

public class Account extends Manager {

    private String accountNumber;
    private double balance;

    public Account(int id, String createdDate, String updatedDate,
                   String bankName, String headOffice,
                   String branchName, String location,
                   String managerName, String managerEmail,
                   String accountNumber, double balance)
            throws BankDataException {

        super(id, createdDate, updatedDate,
                bankName, headOffice, branchName, location,
                managerName, managerEmail);

        if (!accountNumber.matches("\\d{6,}"))
            throw new BankDataException("Account number must be at least 6 digits");

        if (balance < 0)
            throw new BankDataException("Balance cannot be negative");

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    @Override
    public String toString() {
        return "Account[num=" + accountNumber + ", balance=" + balance + "]";
    }
}
