package id27309.q8;

public class Borrow extends Member{
    private String borrowDate;

    public Borrow(int id, String createdDate, String updatedDate,
                  String libraryName, String location,
                  String sectionName, String sectionCode,
                  String title, String author, String isbn,
                  String memberName, String phone,
                  String borrowDate)
            throws LibraryDataException {

        super(id, createdDate, updatedDate,
                libraryName, location,
                sectionName, sectionCode,
                title, author, isbn,
                memberName, phone);

        if (borrowDate == null || borrowDate.isEmpty())
            throw new LibraryDataException("Borrow date required");

        this.borrowDate = borrowDate;
    }

    public String getBorrowDate() { return borrowDate; }
}
