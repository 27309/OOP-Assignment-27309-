package id27309.q7;

public class Driver extends Vehicle{
    private String driverName;
    private String licenseNumber;

    public Driver(int id, String createdDate, String updatedDate,
                  String companyName, String address,
                  String vehicleNumber, String vehicleType, int capacity,
                  String driverName, String licenseNumber)
            throws TransportDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                vehicleNumber, vehicleType, capacity);

        if (driverName == null || driverName.isEmpty())
            throw new TransportDataException("Driver name required");

        if (!licenseNumber.matches("[A-Z0-9]{6,}"))
            throw new TransportDataException("Invalid license number");

        this.driverName = driverName;
        this.licenseNumber = licenseNumber;
    }

    public String getDriverName() { return driverName; }
}
