package id27309.q10;

public class HotelRecord extends Bill {
    public HotelRecord(int id, String createdDate, String updatedDate,
                       String hotelName, String location,
                       String roomNumber, String roomType, double roomPrice,
                       String guestName, String phone,
                       String bookingDate,
                       String checkInDate,
                       String checkOutDate,
                       double serviceCharge,
                       int nights)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, location,
                roomNumber, roomType, roomPrice,
                guestName, phone,
                bookingDate,
                checkInDate,
                checkOutDate,
                serviceCharge,
                nights);
    }

    public double calculateTotal() {
        return (getRoomPrice() * getNights()) + getServiceCharge();
    }
}