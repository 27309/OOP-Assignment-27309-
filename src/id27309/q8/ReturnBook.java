package id27309.q8;

public class ReturnBook extends Borrow{
    private String returnDate;

    public ReturnBook(int id, String createdDate, String updatedDate,
                      String libraryName, String location,
                      String sectionName, String sectionCode,
                      String title, String author, String isbn,
                      String memberName, String phone,
                      String borrowDate, String returnDate)
            throws LibraryDataException {

        super(id, createdDate, updatedDate,
                libraryName, location,
                sectionName, sectionCode,
                title, author, isbn,
                memberName, phone,
                borrowDate);

        if (returnDate == null || returnDate.isEmpty())
            throw new LibraryDataException("Return date required");

        this.returnDate = returnDate;
    }

    public String getReturnDate() { return returnDate; }
}
