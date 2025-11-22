package id27309.q5;

public class Customer extends Room{
    private String customerName;
    private String phone;

    public Customer(int id, String createdDate, String updatedDate,
                    String hotelName, String address,
                    String roomNumber, String roomType, double pricePerNight,
                    String customerName, String phone)
            throws HotelDataException {

        super(id, createdDate, updatedDate,
                hotelName, address,
                roomNumber, roomType, pricePerNight);

        if (customerName == null || customerName.isEmpty())
            throw new HotelDataException("Customer name required");

        if (!phone.matches("\\d{10}"))
            throw new HotelDataException("Phone number must be 10 digits");

        this.customerName = customerName;
        this.phone = phone;
    }

    public String getCustomerName() { return customerName; }
    public String getPhone() { return phone; }

    @Override
    public String toString() {
        return "Customer[name=" + customerName + "]";
    }
}
