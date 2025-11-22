package id27309.q10;

public class CheckIn extends Booking{
    private String checkInDate;

    public CheckIn(int id, String createdDate, String updatedDate,
                   String hotelName, String location,
                   String roomNumber, String roomType, double roomPrice,
                   String guestName, String phone,
                   String bookingDate,
                   String checkInDate)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, location,
                roomNumber, roomType, roomPrice,
                guestName, phone,
                bookingDate);

        if (checkInDate == null || checkInDate.isEmpty())
            throw new HotelDataException("Check-in date required");

        this.checkInDate = checkInDate;
    }

    public String getCheckInDate() { return checkInDate; }
}
