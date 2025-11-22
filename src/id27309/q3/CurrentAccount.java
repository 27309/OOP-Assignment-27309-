package id27309.q3;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(int id, String createdDate, String updatedDate,
                          String bankName, String headOffice,
                          String branchName, String location,
                          String managerName, String managerEmail,
                          String accountNumber, double balance,
                          double overdraftLimit)
            throws BankDataException {

        super(id, createdDate, updatedDate,
                bankName, headOffice, branchName, location,
                managerName, managerEmail,
                accountNumber, balance);

        if (overdraftLimit < 0)
            throw new BankDataException("Overdraft cannot be negative");

        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() { return overdraftLimit; }

    @Override
    public String toString() {
        return "CurrentAccount[overdraft=" + overdraftLimit + "]";
    }
}
