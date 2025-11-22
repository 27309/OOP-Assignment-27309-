package id27309.q4;

public class ReturnBook extends Borrow {
    private String returnDate;

    public ReturnBook(int id, String createdDate, String updatedDate,
                      String libraryName, String location,
                      String sectionName, String category,
                      String librarianName, String email,
                      String memberName, int membershipId, String phone,
                      String bookTitle, String author, String isbn,
                      String borrowDate,
                      String returnDate)
            throws LibraryDataException {

        super(id, createdDate, updatedDate,
                libraryName, location, sectionName, category,
                librarianName, email,
                memberName, membershipId, phone,
                bookTitle, author, isbn,
                borrowDate);

        if (returnDate == null || returnDate.isEmpty())
            throw new LibraryDataException("Return date required");

        this.returnDate = returnDate;
    }

    public String getReturnDate() { return returnDate; }

    @Override
    public String toString() {
        return "ReturnBook[returnDate=" + returnDate + "]";
    }
}
