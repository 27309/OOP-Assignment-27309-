package id27309.q3;

public class Bank extends Entity {
    private String bankName;
    private String headOffice;

    public Bank(int id, String createdDate, String updatedDate,
                String bankName, String headOffice)
            throws BankDataException {

        super(id, createdDate, updatedDate);

        if (bankName == null || bankName.isEmpty())
            throw new BankDataException("Bank name is required");

        if (headOffice == null || headOffice.isEmpty())
            throw new BankDataException("Head office is required");

        this.bankName = bankName;
        this.headOffice = headOffice;
    }

    public String getBankName() { return bankName; }
    public String getHeadOffice() { return headOffice; }

    @Override
    public String toString() {
        return "Bank[name=" + bankName + ", HQ=" + headOffice + "]";
    }
}
