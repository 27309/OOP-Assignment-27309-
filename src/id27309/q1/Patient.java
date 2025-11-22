package id27309.q1;

public class Patient extends Nurse {

    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;

    public Patient(int id, String createdDate, String updatedDate,
                   String hospitalName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String doctorName, String specialization, String doctorEmail, String doctorPhone,
                   String nurseName, String shift, int yearsOfExperience,
                   String patientName, int age, String gender, String contactNumber)
            throws HospitalDataException {

        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsOfExperience);

        if (age <= 0)
            throw new HospitalDataException("Age must be > 0");

        if (!contactNumber.matches("\\d{10}"))
            throw new HospitalDataException("Contact number must be 10 digits");

        if (!(gender.equalsIgnoreCase("Male") ||
                gender.equalsIgnoreCase("Female") ||
                gender.equalsIgnoreCase("Other")))
            throw new HospitalDataException("Invalid gender");

        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContactNumber() { return contactNumber; }

    @Override
    public String toString() {
        return "Patient[name=" + patientName + ", age=" + age +
                ", gender=" + gender + "]";
    }
}
