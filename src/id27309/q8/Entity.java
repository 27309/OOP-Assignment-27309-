package id27309.q8;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws LibraryDataException {
        if (id <= 0) throw new LibraryDataException("ID must be positive");
        if (createdDate == null || createdDate.isEmpty())
            throw new LibraryDataException("Created date is required");
        if (updatedDate == null || updatedDate.isEmpty())
            throw new LibraryDataException("Updated date is required");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
}
