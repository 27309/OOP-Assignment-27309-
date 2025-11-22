package id27309.q9;

public class Customer extends Account{
    private String customerName;
    private String phone;

    public Customer(int id, String createdDate, String updatedDate,
                    String bankName, String headOffice,
                    String branchName, String branchCode,
                    String accountNumber, String accountType,
                    String customerName, String phone)
            throws BankDataException {

        super(id, createdDate, updatedDate,
                bankName, headOffice,
                branchName, branchCode,
                accountNumber, accountType);

        if (customerName == null || customerName.isEmpty())
            throw new BankDataException("Customer name required");

        if (!phone.matches("\\d{10}"))
            throw new BankDataException("Phone number must be 10 digits");

        this.customerName = customerName;
        this.phone = phone;
    }
}
