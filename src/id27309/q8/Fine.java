package id27309.q8;

public class Fine extends ReturnBook{
    private int lateDays;
    private double fineRate;

    public Fine(int id, String createdDate, String updatedDate,
                String libraryName, String location,
                String sectionName, String sectionCode,
                String title, String author, String isbn,
                String memberName, String phone,
                String borrowDate, String returnDate,
                int lateDays, double fineRate)
            throws LibraryDataException {

        super(id, createdDate, updatedDate,
                libraryName, location,
                sectionName, sectionCode,
                title, author, isbn,
                memberName, phone,
                borrowDate, returnDate);

        if (lateDays < 0)
            throw new LibraryDataException("Late days cannot be negative");

        if (fineRate <= 0)
            throw new LibraryDataException("Fine rate must be positive");

        this.lateDays = lateDays;
        this.fineRate = fineRate;
    }

    public double calculateFine() {
        return lateDays * fineRate;
    }
}
