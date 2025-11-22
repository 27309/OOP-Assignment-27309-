package id27309.q1;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(int id, String createdDate, String updatedDate,
                    String hospitalName, String address,
                    String phoneNumber, String email) throws HospitalDataException {
        super(id, createdDate, updatedDate);

        if (hospitalName == null || hospitalName.isEmpty())
            throw new HospitalDataException("Hospital name cannot be empty");

        if (address == null || address.isEmpty())
            throw new HospitalDataException("Address cannot be empty");

        if (!phoneNumber.matches("\\d{10}"))
            throw new HospitalDataException("Phone number must be 10 digits");

        if (!email.contains("@"))
            throw new HospitalDataException("Invalid email");

        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHospitalName() { return hospitalName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Hospital[name=" + hospitalName + ", address=" + address +
                ", phone=" + phoneNumber + ", email=" + email + "]";
    }
}
