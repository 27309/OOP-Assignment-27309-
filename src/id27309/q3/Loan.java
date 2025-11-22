package id27309.q3;

public class Loan extends Transaction {

    private double loanAmount;
    private double monthlyInterest;

    public Loan(int id, String createdDate, String updatedDate,
                String bankName, String headOffice,
                String branchName, String location,
                String managerName, String managerEmail,
                String accountNumber, double balance,
                double interestRate,
                double amount, String type,
                double loanAmount, double monthlyInterest)
            throws BankDataException {

        super(id, createdDate, updatedDate,
                bankName, headOffice, branchName, location,
                managerName, managerEmail,
                accountNumber, balance,
                interestRate,
                amount, type);

        if (loanAmount <= 0)
            throw new BankDataException("Loan amount must be > 0");

        if (monthlyInterest <= 0)
            throw new BankDataException("Monthly interest must be > 0");

        this.loanAmount = loanAmount;
        this.monthlyInterest = monthlyInterest;
    }

    public double getLoanAmount() { return loanAmount; }
    public double getMonthlyInterest() { return monthlyInterest; }

    @Override
    public String toString() {
        return "Loan[amount=" + loanAmount + ", interest=" + monthlyInterest + "]";
    }
}
