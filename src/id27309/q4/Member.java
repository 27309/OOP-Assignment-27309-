package id27309.q4;

public class Member extends Librarian{
    private String memberName;
    private int membershipId;
    private String phone;

    public Member(int id, String createdDate, String updatedDate,
                  String libraryName, String location,
                  String sectionName, String category,
                  String librarianName, String email,
                  String memberName, int membershipId, String phone)
            throws LibraryDataException {

        super(id, createdDate, updatedDate,
                libraryName, location, sectionName, category,
                librarianName, email);

        if (membershipId <= 0)
            throw new LibraryDataException("Membership ID must be > 0");

        if (!phone.matches("\\d{10}"))
            throw new LibraryDataException("Phone number must be 10 digits");

        this.memberName = memberName;
        this.membershipId = membershipId;
        this.phone = phone;
    }

    public String getMemberName() { return memberName; }
    public int getMembershipId() { return membershipId; }
    public String getPhone() { return phone; }

    @Override
    public String toString() {
        return "Member[name=" + memberName + ", ID=" + membershipId + "]";
    }
}
