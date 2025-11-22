package id27309.q5;

public class Payment extends Booking{
    private double roomCost;

    public Payment(int id, String createdDate, String updatedDate,
                   String hotelName, String address,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String phone,
                   String checkInDate, String checkOutDate, int nights,
                   double roomCost)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, address,
                roomNumber, roomType, pricePerNight,
                customerName, phone,
                checkInDate, checkOutDate, nights);

        if (roomCost <= 0)
            throw new HotelDataException("Room cost must be > 0");

        this.roomCost = roomCost;
    }

    public double getRoomCost() { return roomCost; }

    @Override
    public String toString() {
        return "Payment[cost=" + roomCost + "]";
    }
}
