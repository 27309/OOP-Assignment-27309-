package id27309.q9;

public class Bank extends Entity{
    private String bankName;
    private String headOffice;

    public Bank(int id, String createdDate, String updatedDate,
                String bankName, String headOffice)
            throws BankDataException {

        super(id, createdDate, updatedDate);

        if (bankName == null || bankName.isEmpty())
            throw new BankDataException("Bank name required");

        if (headOffice == null || headOffice.isEmpty())
            throw new BankDataException("Head office required");

        this.bankName = bankName;
        this.headOffice = headOffice;
    }
}
