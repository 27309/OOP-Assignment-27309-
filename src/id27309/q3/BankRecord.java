package id27309.q3;

public class BankRecord extends Loan{
    public BankRecord(int id, String createdDate, String updatedDate,
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
                amount, type,
                loanAmount, monthlyInterest);
    }

    public double calculateTotalLoanPayment() {
        return getLoanAmount() + (getLoanAmount() * getMonthlyInterest() / 100);
    }
}
