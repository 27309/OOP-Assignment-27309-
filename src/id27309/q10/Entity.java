package id27309.q10;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws HotelDataException {
        if (id <= 0) throw new HotelDataException("ID must be positive");
        if (createdDate == null || createdDate.isEmpty())
            throw new HotelDataException("Created date required");
        if (updatedDate == null || updatedDate.isEmpty())
            throw new HotelDataException("Updated date required");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
}
