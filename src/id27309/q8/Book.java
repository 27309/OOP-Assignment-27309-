package id27309.q8;

public class Book extends Section {
    private String title;
    private String author;
    private String isbn;

    public Book(int id, String createdDate, String updatedDate,
                String libraryName, String location,
                String sectionName, String sectionCode,
                String title, String author, String isbn)
            throws LibraryDataException {

        super(id, createdDate, updatedDate, libraryName, location, sectionName, sectionCode);

        if (title == null || title.isEmpty())
            throw new LibraryDataException("Book title required");

        if (!isbn.matches("[0-9]{10,13}"))
            throw new LibraryDataException("Invalid ISBN (10–13 digits)");

        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() { return title; }
}
