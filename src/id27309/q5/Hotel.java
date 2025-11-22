package id27309.q5;

public class Hotel extends Entity  {
    private String hotelName;
    private String address;

    public Hotel(int id, String createdDate, String updatedDate,
                 String hotelName, String address)
            throws HotelDataException {

        super(id, createdDate, updatedDate);

        if (hotelName == null || hotelName.isEmpty())
            throw new HotelDataException("Hotel name required");

        if (address == null || address.isEmpty())
            throw new HotelDataException("Address required");

        this.hotelName = hotelName;
        this.address = address;
    }

    public String getHotelName() { return hotelName; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "Hotel[name=" + hotelName + ", address=" + address + "]";
    }
}
