package id27309.q7;

public class Passenger extends Trip{
    private String passengerName;
    private String phone;

    public Passenger(int id, String createdDate, String updatedDate,
                     String companyName, String address,
                     String vehicleNumber, String vehicleType, int capacity,
                     String driverName, String licenseNumber,
                     String startLocation, String destination, int distanceKm,
                     String tripDate,
                     String passengerName, String phone)
            throws TransportDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                vehicleNumber, vehicleType, capacity,
                driverName, licenseNumber,
                startLocation, destination, distanceKm,
                tripDate);

        if (!phone.matches("\\d{10}"))
            throw new TransportDataException("Phone must be 10 digits");

        this.passengerName = passengerName;
        this.phone = phone;
    }

    public String getPassengerName() { return passengerName; }
}
