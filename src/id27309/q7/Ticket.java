package id27309.q7;

public class Ticket extends Passenger{
    private double ticketPrice;

    public Ticket(int id, String createdDate, String updatedDate,
                  String companyName, String address,
                  String vehicleNumber, String vehicleType, int capacity,
                  String driverName, String licenseNumber,
                  String startLocation, String destination, int distanceKm,
                  String tripDate,
                  String passengerName, String phone,
                  double ticketPrice)
            throws TransportDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                vehicleNumber, vehicleType, capacity,
                driverName, licenseNumber,
                startLocation, destination, distanceKm,
                tripDate,
                passengerName, phone);

        if (ticketPrice <= 0)
            throw new TransportDataException("Ticket price must be > 0");

        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() { return ticketPrice; }
}
