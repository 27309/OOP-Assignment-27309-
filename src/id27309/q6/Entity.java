package id27309.q6;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws EmployeeDataException {
        if (id <= 0) throw new EmployeeDataException("ID must be > 0");
        if (createdDate == null || createdDate.isEmpty())
            throw new EmployeeDataException("Created date is required");
        if (updatedDate == null || updatedDate.isEmpty())
            throw new EmployeeDataException("Updated date is required");

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
