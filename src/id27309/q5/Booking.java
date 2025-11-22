package id27309.q5;

public class Booking extends Customer{
    private String checkInDate;
    private String checkOutDate;
    private int nights;

    public Booking(int id, String createdDate, String updatedDate,
                   String hotelName, String address,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String phone,
                   String checkInDate, String checkOutDate, int nights)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, address,
                roomNumber, roomType, pricePerNight,
                customerName, phone);

        if (nights <= 0)
            throw new HotelDataException("Nights must be > 0");

        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.nights = nights;
    }

    public String getCheckInDate() { return checkInDate; }
    public String getCheckOutDate() { return checkOutDate; }
    public int getNights() { return nights; }

    @Override
    public String toString() {
        return "Booking[nights=" + nights + "]";
    }
}
