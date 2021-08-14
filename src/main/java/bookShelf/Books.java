package bookShelf;

public class Books {

    private String author, bookTitle;
    private int publishingYear;


    public Books(String author, String bookTitle, int publishingYear) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
