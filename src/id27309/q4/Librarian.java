package id27309.q4;

public class Librarian extends Section{
    private String librarianName;
    private String email;

    public Librarian(int id, String createdDate, String updatedDate,
                     String libraryName, String location,
                     String sectionName, String category,
                     String librarianName, String email)
            throws LibraryDataException {

        super(id, createdDate, updatedDate, libraryName, location,
                sectionName, category);

        if (librarianName == null || librarianName.isEmpty())
            throw new LibraryDataException("Librarian name is required");

        if (!email.contains("@"))
            throw new LibraryDataException("Invalid email address");

        this.librarianName = librarianName;
        this.email = email;
    }

    public String getLibrarianName() { return librarianName; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Librarian[name=" + librarianName + "]";
    }
}
