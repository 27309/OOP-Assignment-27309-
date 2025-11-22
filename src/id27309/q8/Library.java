package id27309.q8;

import id27309.q7.Entity;

public class Library extends Entity {
    private String libraryName;
    private String location;

    public Library(int id, String createdDate, String updatedDate,
                   String libraryName, String location)
            throws LibraryDataException {

        super(id, createdDate, updatedDate);

        if (libraryName == null || libraryName.isEmpty())
            throw new LibraryDataException("Library name required");
        if (location == null || location.isEmpty())
            throw new LibraryDataException("Location required");

        this.libraryName = libraryName;
        this.location = location;
    }

    public String getLibraryName() { return libraryName; }
}
