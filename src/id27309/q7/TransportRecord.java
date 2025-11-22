package id27309.q7;

public class TransportRecord extends Payment{
    public TransportRecord(int id, String createdDate, String updatedDate,
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
                ticketPrice,
                amountPaid);
    }

    public double calculateChange() {
        return getAmountPaid() - getTicketPrice();
    }
}
