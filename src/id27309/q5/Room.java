package id27309.q5;

public class Room extends Hotel {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, String createdDate, String updatedDate,
                String hotelName, String address,
                String roomNumber, String roomType, double pricePerNight)
            throws HotelDataException {

        super(id, createdDate, updatedDate, hotelName, address);

        if (!roomNumber.matches("\\d+"))
            throw new HotelDataException("Room number must be numeric");

        if (pricePerNight <= 0)
            throw new HotelDataException("Price per night must be > 0");

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public double getPricePerNight() { return pricePerNight; }

    @Override
    public String toString() {
        return "Room[number=" + roomNumber + "]";
    }
}
