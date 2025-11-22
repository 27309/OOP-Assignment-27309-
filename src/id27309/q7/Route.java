package id27309.q7;

public class Route extends Driver{
    private String startLocation;
    private String destination;
    private int distanceKm;

    public Route(int id, String createdDate, String updatedDate,
                 String companyName, String address,
                 String vehicleNumber, String vehicleType, int capacity,
                 String driverName, String licenseNumber,
                 String startLocation, String destination, int distanceKm)
            throws TransportDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                vehicleNumber, vehicleType, capacity,
                driverName, licenseNumber);

        if (distanceKm <= 0)
            throw new TransportDataException("Distance must be positive");

        this.startLocation = startLocation;
        this.destination = destination;
        this.distanceKm = distanceKm;
    }

    public int getDistanceKm() { return distanceKm; }
}
