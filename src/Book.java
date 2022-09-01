public class Book {
    private final Author authorName;
    private int publishingYear;
    private final String bookTitle;

    public Book(String bookTitle, int publishingYear, Author authorName) {
        this.bookTitle = bookTitle;
        this.publishingYear = publishingYear;
        this.authorName = authorName;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
