package id27309.q5;

public class FoodOrder extends Payment{
    private double foodBill;

    public FoodOrder(int id, String createdDate, String updatedDate,
                     String hotelName, String address,
                     String roomNumber, String roomType, double pricePerNight,
                     String customerName, String phone,
                     String checkInDate, String checkOutDate, int nights,
                     double roomCost,
                     double foodBill)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, address,
                roomNumber, roomType, pricePerNight,
                customerName, phone,
                checkInDate, checkOutDate, nights,
                roomCost);

        if (foodBill < 0)
            throw new HotelDataException("Food bill cannot be negative");

        this.foodBill = foodBill;
    }

    public double getFoodBill() { return foodBill; }

    @Override
    public String toString() {
        return "FoodOrder[bill=" + foodBill + "]";
    }
}
