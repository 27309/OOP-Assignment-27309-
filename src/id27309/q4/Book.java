package id27309.q4;

public class Book extends Member{
    private String bookTitle;
    private String author;
    private String isbn;

    public Book(int id, String createdDate, String updatedDate,
                String libraryName, String location,
                String sectionName, String category,
                String librarianName, String email,
                String memberName, int membershipId, String phone,
                String bookTitle, String author, String isbn)
            throws LibraryDataException {

        super(id, createdDate, updatedDate,
                libraryName, location, sectionName, category,
                librarianName, email,
                memberName, membershipId, phone);

        if (bookTitle == null || bookTitle.isEmpty())
            throw new LibraryDataException("Book title required");

        if (author == null || author.isEmpty())
            throw new LibraryDataException("Author required");

        if (!isbn.matches("\\d{10}|\\d{13}"))
            throw new LibraryDataException("ISBN must be 10 or 13 digits");

        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
    }

    public String getBookTitle() { return bookTitle; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    @Override
    public String toString() {
        return "Book[title=" + bookTitle + "]";
    }
}
