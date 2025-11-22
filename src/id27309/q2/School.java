package id27309.q2;

public class School extends Entity {

    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(int id, String createdDate, String updatedDate,
                  String schoolName, String address,
                  String phoneNumber, String email)
            throws SchoolDataException {

        super(id, createdDate, updatedDate);

        if (schoolName == null || schoolName.isEmpty())
            throw new SchoolDataException("School name cannot be empty");

        if (address == null || address.isEmpty())
            throw new SchoolDataException("Address cannot be empty");

        if (!phoneNumber.matches("\\d{10}"))
            throw new SchoolDataException("Phone number must be 10 digits");

        if (!email.contains("@"))
            throw new SchoolDataException("Invalid email");

        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getSchoolName() { return schoolName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "School[name=" + schoolName + ", address=" + address +
                ", phone=" + phoneNumber + ", email=" + email + "]";
    }
}
