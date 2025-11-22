package id27309.q7;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws TransportDataException {
        if (id <= 0) throw new TransportDataException("ID must be positive");
        if (createdDate == null || createdDate.isEmpty())
            throw new TransportDataException("Created date required");
        if (updatedDate == null || updatedDate.isEmpty())
            throw new TransportDataException("Updated date required");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }

    @Override
    public String toString() {
        return "Entity[id=" + id + "]";
    }
}
