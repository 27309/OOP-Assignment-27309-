package id27309.q10;

public class Guest extends Room{
    private String guestName;
    private String phone;

    public Guest(int id, String createdDate, String updatedDate,
                 String hotelName, String location,
                 String roomNumber, String roomType, double roomPrice,
                 String guestName, String phone)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, location,
                roomNumber, roomType, roomPrice);

        if (guestName == null || guestName.isEmpty())
            throw new HotelDataException("Guest name required");

        if (!phone.matches("\\d{10}"))
            throw new HotelDataException("Phone number must be 10 digits");

        this.guestName = guestName;
        this.phone = phone;
    }
}
