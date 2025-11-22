package id27309.q7;

public class Vehicle extends TransportCompany{
    private String vehicleNumber;
    private String vehicleType;
    private int capacity;

    public Vehicle(int id, String createdDate, String updatedDate,
                   String companyName, String address,
                   String vehicleNumber, String vehicleType, int capacity)
            throws TransportDataException {

        super(id, createdDate, updatedDate, companyName, address);

        if (!vehicleNumber.matches("[A-Z0-9-]{5,}"))
            throw new TransportDataException("Invalid vehicle number");

        if (capacity <= 0)
            throw new TransportDataException("Capacity must be positive");

        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.capacity = capacity;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public int getCapacity() { return capacity; }
}
