package id27309.q3;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(int id, String createdDate, String updatedDate,
                          String bankName, String headOffice,
                          String branchName, String location,
                          String managerName, String managerEmail,
                          String accountNumber, double balance,
                          double interestRate)
            throws BankDataException {

        super(id, createdDate, updatedDate,
                bankName, headOffice, branchName, location,
                managerName, managerEmail,
                accountNumber, balance);

        if (interestRate <= 0)
            throw new BankDataException("Interest rate must be positive");

        this.interestRate = interestRate;
    }

    public double getInterestRate() { return interestRate; }

    @Override
    public String toString() {
        return "SavingsAccount[interest=" + interestRate + "%]";
    }
}
