package id27309.q4;

public class Borrow extends Book{
    private String borrowDate;

    public Borrow(int id, String createdDate, String updatedDate,
                  String libraryName, String location,
                  String sectionName, String category,
                  String librarianName, String email,
                  String memberName, int membershipId, String phone,
                  String bookTitle, String author, String isbn,
                  String borrowDate)
            throws LibraryDataException {

        super(id, createdDate, updatedDate,
                libraryName, location, sectionName, category,
                librarianName, email,
                memberName, membershipId, phone,
                bookTitle, author, isbn);

        if (borrowDate == null || borrowDate.isEmpty())
            throw new LibraryDataException("Borrow date required");

        this.borrowDate = borrowDate;
    }

    public String getBorrowDate() { return borrowDate; }

    @Override
    public String toString() {
        return "Borrow[date=" + borrowDate + "]";
    }
}
