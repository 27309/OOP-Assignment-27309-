package id27309.q7;

public class TransportCompany extends Entity{
    private String companyName;
    private String address;

    public TransportCompany(int id, String createdDate, String updatedDate,
                            String companyName, String address)
            throws TransportDataException {

        super(id, createdDate, updatedDate);

        if (companyName == null || companyName.isEmpty())
            throw new TransportDataException("Company name required");

        if (address == null || address.isEmpty())
            throw new TransportDataException("Address required");

        this.companyName = companyName;
        this.address = address;
    }

    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
}
