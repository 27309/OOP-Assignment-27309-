package id27309.q7;

public class Trip extends Route{
    private String tripDate;

    public Trip(int id, String createdDate, String updatedDate,
                String companyName, String address,
                String vehicleNumber, String vehicleType, int capacity,
                String driverName, String licenseNumber,
                String startLocation, String destination, int distanceKm,
                String tripDate)
            throws TransportDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                vehicleNumber, vehicleType, capacity,
                driverName, licenseNumber,
                startLocation, destination, distanceKm);

        if (tripDate == null || tripDate.isEmpty())
            throw new TransportDataException("Trip date required");

        this.tripDate = tripDate;
    }

    public String getTripDate() { return tripDate; }
}
