package id27309.q1;

public class Treatment extends Admission {

    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;

    public Treatment(int id, String createdDate, String updatedDate,
                     String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String doctorPhone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     String admissionDate, String roomNumber, double roomCharges,
                     String diagnosis, String treatmentGiven, double treatmentCost)
            throws HospitalDataException {

        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber,
                admissionDate, roomNumber, roomCharges);

        if (treatmentCost <= 0)
            throw new HospitalDataException("Treatment cost must be > 0");

        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }

    public String getDiagnosis() { return diagnosis; }
    public String getTreatmentGiven() { return treatmentGiven; }
    public double getTreatmentCost() { return treatmentCost; }

    @Override
    public String toString() {
        return "Treatment[diagnosis=" + diagnosis +
                ", treatment=" + treatmentGiven +
                ", cost=" + treatmentCost + "]";
    }

}
