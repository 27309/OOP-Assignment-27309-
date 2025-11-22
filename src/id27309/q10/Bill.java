package id27309.q10;

public class Bill extends Service{
    private int nights;

    public Bill(int id, String createdDate, String updatedDate,
                String hotelName, String location,
                String roomNumber, String roomType, double roomPrice,
                String guestName, String phone,
                String bookingDate,
                String checkInDate,
                String checkOutDate,
                double serviceCharge,
                int nights)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, location,
                roomNumber, roomType, roomPrice,
                guestName, phone,
                bookingDate,
                checkInDate,
                checkOutDate,
                serviceCharge);

        if (nights <= 0)
            throw new HotelDataException("Nights stayed must be > 0");

        this.nights = nights;
    }

    public int getNights() { return nights; }
}
