package id27309.q5;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws HotelDataException {
        if (id <= 0) throw new HotelDataException("ID must be > 0");
        if (createdDate == null || createdDate.isEmpty())
            throw new HotelDataException("Created date is required");
        if (updatedDate == null || updatedDate.isEmpty())
            throw new HotelDataException("Updated date is required");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }

    @Override
    public String toString() {
        return "Entity[id=" + id + "]";
    }
}
