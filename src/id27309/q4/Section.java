package id27309.q4;

public class Section extends Library{
    private String sectionName;
    private String category;

    public Section(int id, String createdDate, String updatedDate,
                   String libraryName, String location,
                   String sectionName, String category)
            throws LibraryDataException {

        super(id, createdDate, updatedDate, libraryName, location);

        if (sectionName == null || sectionName.isEmpty())
            throw new LibraryDataException("Section name is required");

        if (category == null || category.isEmpty())
            throw new LibraryDataException("Category is required");

        this.sectionName = sectionName;
        this.category = category;
    }

    public String getSectionName() { return sectionName; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "Section[name=" + sectionName + ", category=" + category + "]";
    }
}
