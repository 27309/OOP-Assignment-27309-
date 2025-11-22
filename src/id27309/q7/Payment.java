package id27309.q7;

public class Payment extends Ticket{
    private double amountPaid;

    public Payment(int id, String createdDate, String updatedDate,
                   String companyName, String address,
                   String vehicleNumber, String vehicleType, int capacity,
                   String driverName, String licenseNumber,
                   String startLocation, String destination, int distanceKm,
                   String tripDate,
                   String passengerName, String phone,
                   double ticketPrice,
                   double amountPaid)
            throws TransportDataException {

        super(id, createdDate, updatedDate,
                companyName, address,
                vehicleNumber, vehicleType, capacity,
                driverName, licenseNumber,
                startLocation, destination, distanceKm,
                tripDate,
                passengerName, phone,
                ticketPrice);

        if (amountPaid < ticketPrice)
            throw new TransportDataException("Amount paid cannot be less than ticket price");

        this.amountPaid = amountPaid;
    }

    public double getAmountPaid() { return amountPaid; }
}
