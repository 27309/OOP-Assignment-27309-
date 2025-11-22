package id27309.q8;

public class Payment extends Fine{
    private double amountPaid;

    public Payment(int id, String createdDate, String updatedDate,
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
                lateDays, fineRate);

        if (amountPaid < 0)
            throw new LibraryDataException("Amount paid cannot be negative");

        this.amountPaid = amountPaid;
    }

    public double getAmountPaid() { return amountPaid; }
}
