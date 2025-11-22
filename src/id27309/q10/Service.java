package id27309.q10;

public class Service extends CheckOut{
    private double serviceCharge;

    public Service(int id, String createdDate, String updatedDate,
                   String hotelName, String location,
                   String roomNumber, String roomType, double roomPrice,
                   String guestName, String phone,
                   String bookingDate,
                   String checkInDate,
                   String checkOutDate,
                   double serviceCharge)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, location,
                roomNumber, roomType, roomPrice,
                guestName, phone,
                bookingDate,
                checkInDate,
                checkOutDate);

        if (serviceCharge < 0)
            throw new HotelDataException("Service charge cannot be negative");

        this.serviceCharge = serviceCharge;
    }

    public double getServiceCharge() { return serviceCharge; }
}
