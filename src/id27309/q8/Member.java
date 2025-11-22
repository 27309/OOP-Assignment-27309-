package id27309.q8;

public class Member extends Book{
    private String memberName;
    private String phone;

    public Member(int id, String createdDate, String updatedDate,
                  String libraryName, String location,
                  String sectionName, String sectionCode,
                  String title, String author, String isbn,
                  String memberName, String phone)
            throws LibraryDataException {

        super(id, createdDate, updatedDate,
                libraryName, location,
                sectionName, sectionCode,
                title, author, isbn);

        if (memberName == null || memberName.isEmpty())
            throw new LibraryDataException("Member name required");

        if (!phone.matches("\\d{10}"))
            throw new LibraryDataException("Phone must be 10 digits");

        this.memberName = memberName;
        this.phone = phone;
    }

    public String getMemberName() { return memberName; }
}
