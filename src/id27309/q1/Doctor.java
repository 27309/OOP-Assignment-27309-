package id27309.q1;

public class Doctor extends Department {

    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String doctorPhone;

    public Doctor(int id, String createdDate, String updatedDate,
                  String hospitalName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String doctorName, String specialization,
                  String doctorEmail, String doctorPhone)
            throws HospitalDataException {

        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode);

        if (doctorName == null || doctorName.isEmpty())
            throw new HospitalDataException("Doctor name cannot be empty");

        if (specialization == null || specialization.isEmpty())
            throw new HospitalDataException("Specialization cannot be empty");

        if (!doctorPhone.matches("\\d{10}"))
            throw new HospitalDataException("Doctor phone must be 10 digits");

        if (!doctorEmail.contains("@"))
            throw new HospitalDataException("Invalid doctor email");

        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.doctorPhone = doctorPhone;
    }

    public String getDoctorName() { return doctorName; }
    public String getSpecialization() { return specialization; }
    public String getDoctorEmail() { return doctorEmail; }
    public String getDoctorPhone() { return doctorPhone; }

    @Override
    public String toString() {
        return "Doctor[name=" + doctorName + ", specialization=" + specialization + "]";
    }
}
