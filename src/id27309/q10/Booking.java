package id27309.q10;

public class Booking extends Guest{
    private String bookingDate;

    public Booking(int id, String createdDate, String updatedDate,
                   String hotelName, String location,
                   String roomNumber, String roomType, double roomPrice,
                   String guestName, String phone,
                   String bookingDate)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, location,
                roomNumber, roomType, roomPrice,
                guestName, phone);

        if (bookingDate == null || bookingDate.isEmpty())
            throw new HotelDataException("Booking date required");

        this.bookingDate = bookingDate;
    }

    public String getBookingDate() { return bookingDate; }
}
