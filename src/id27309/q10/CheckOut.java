package id27309.q10;

public class CheckOut extends CheckIn{
    private String checkOutDate;

    public CheckOut(int id, String createdDate, String updatedDate,
                    String hotelName, String location,
                    String roomNumber, String roomType, double roomPrice,
                    String guestName, String phone,
                    String bookingDate,
                    String checkInDate,
                    String checkOutDate)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, location,
                roomNumber, roomType, roomPrice,
                guestName, phone,
                bookingDate,
                checkInDate);

        if (checkOutDate == null || checkOutDate.isEmpty())
            throw new HotelDataException("Check-out date required");

        this.checkOutDate = checkOutDate;
    }

    public String getCheckOutDate() { return checkOutDate; }
}
