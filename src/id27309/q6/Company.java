package id27309.q6;

public class Company extends Entity{
    private String companyName;
    private String address;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address)
            throws EmployeeDataException {

        super(id, createdDate, updatedDate);

        if (companyName == null || companyName.isEmpty())
            throw new EmployeeDataException("Company name required");

        if (address == null || address.isEmpty())
            throw new EmployeeDataException("Address required");

        this.companyName = companyName;
        this.address = address;
    }

    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "Company[name=" + companyName + "]";
    }
}
