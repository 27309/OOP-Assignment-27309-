package id27309.q10;

public class Room extends Hotel{
    private String roomNumber;
    private String roomType;
    private double roomPrice;

    public Room(int id, String createdDate, String updatedDate,
                String hotelName, String location,
                String roomNumber, String roomType, double roomPrice)
            throws HotelDataException {

        super(id, createdDate, updatedDate, hotelName, location);

        if (!roomNumber.matches("[0-9]{1,4}"))
            throw new HotelDataException("Invalid room number");
        if (roomPrice <= 0)
            throw new HotelDataException("Room price must be positive");

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public double getRoomPrice() { return roomPrice; }
}
