package id27309.q4;

public class LibraryRecord extends Fine {
    public LibraryRecord(int id, String createdDate, String updatedDate,
                         String libraryName, String location,
                         String sectionName, String category,
                         String librarianName, String email,
                         String memberName, int membershipId, String phone,
                         String bookTitle, String author, String isbn,
                         String borrowDate, String returnDate,
                         int daysLate, double finePerDay)
            throws LibraryDataException {

        super(id, createdDate, updatedDate,
                libraryName, location, sectionName, category,
                librarianName, email,
                memberName, membershipId, phone,
                bookTitle, author, isbn,
                borrowDate, returnDate,
                daysLate, finePerDay);
    }

    public double calculateTotalFine() {
        return getDaysLate() * getFinePerDay();
    }
}
