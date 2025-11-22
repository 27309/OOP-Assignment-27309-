package id27309.q8;

public class LibraryRecord extends Payment{

    public LibraryRecord(int id, String createdDate, String updatedDate,
                         String libraryName, String location,
                         String sectionName, String sectionCode,
                         String title, String author, String isbn,
                         String memberName, String phone,
                         String borrowDate, String returnDate,
                         int lateDays, double fineRate,
                         double amountPaid)
            throws LibraryDataException {

        super(id, createdDate, updatedDate,
                libraryName, location,
                sectionName, sectionCode,
                title, author, isbn,
                memberName, phone,
                borrowDate, returnDate,
                lateDays, fineRate,
                amountPaid);
    }

    public double calculateBalance() {
        return getAmountPaid() - calculateFine();
    }
}
