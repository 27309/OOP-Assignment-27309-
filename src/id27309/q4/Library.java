package id27309.q4;

public class Library extends Entity {
    private String libraryName;
    private String location;

    public Library(int id, String createdDate, String updatedDate,
                   String libraryName, String location)
            throws LibraryDataException {

        super(id, createdDate, updatedDate);

        if (libraryName == null || libraryName.isEmpty())
            throw new LibraryDataException("Library name is required");

        if (location == null || location.isEmpty())
            throw new LibraryDataException("Location is required");

        this.libraryName = libraryName;
        this.location = location;
    }

    public String getLibraryName() { return libraryName; }
    public String getLocation() { return location; }

    @Override
    public String toString() {
        return "Library[name=" + libraryName + ", location=" + location + "]";
    }

}
