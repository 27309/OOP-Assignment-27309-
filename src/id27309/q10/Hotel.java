package id27309.q10;

public class Hotel extends Entity{
    private String hotelName;
    private String location;

    public Hotel(int id, String createdDate, String updatedDate,
                 String hotelName, String location)
            throws HotelDataException {

        super(id, createdDate, updatedDate);

        if (hotelName == null || hotelName.isEmpty())
            throw new HotelDataException("Hotel name required");

        if (location == null || location.isEmpty())
            throw new HotelDataException("Location required");

        this.hotelName = hotelName;
        this.location = location;
    }
}
