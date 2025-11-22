package id27309.q4;

public class Fine extends ReturnBook {
    private int daysLate;
    private double finePerDay;

    public Fine(int id, String createdDate, String updatedDate,
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
                borrowDate, returnDate);

        if (daysLate < 0)
            throw new LibraryDataException("Days late cannot be negative");

        if (finePerDay <= 0)
            throw new LibraryDataException("Fine per day must be > 0");

        this.daysLate = daysLate;
        this.finePerDay = finePerDay;
    }

    public int getDaysLate() { return daysLate; }
    public double getFinePerDay() { return finePerDay; }

    @Override
    public String toString() {
        return "Fine[daysLate=" + daysLate + ", finePerDay=" + finePerDay + "]";
    }
}
