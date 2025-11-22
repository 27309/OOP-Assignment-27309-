package id27309.q8;

public class Section extends Library{
    private String sectionName;
    private String sectionCode;

    public Section(int id, String createdDate, String updatedDate,
                   String libraryName, String location,
                   String sectionName, String sectionCode)
            throws LibraryDataException {

        super(id, createdDate, updatedDate, libraryName, location);

        if (sectionName == null || sectionName.isEmpty())
            throw new LibraryDataException("Section name required");

        if (!sectionCode.matches("[A-Z0-9]{3,}"))
            throw new LibraryDataException("Section code must be 3+ alphanumeric characters");

        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }

    public String getSectionName() { return sectionName; }
}
