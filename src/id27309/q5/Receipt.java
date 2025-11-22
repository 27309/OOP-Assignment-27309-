package id27309.q5;

public class Receipt extends Service{
    public Receipt(int id, String createdDate, String updatedDate,
                   String hotelName, String address,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String phone,
                   String checkInDate, String checkOutDate, int nights,
                   double roomCost,
                   double foodBill,
                   double serviceCharge)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, address,
                roomNumber, roomType, pricePerNight,
                customerName, phone,
                checkInDate, checkOutDate, nights,
                roomCost,
                foodBill,
                serviceCharge);
    }
}
