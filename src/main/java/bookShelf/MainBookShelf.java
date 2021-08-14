package bookShelf;

public class MainBookShelf {

    static class BookCollection extends Books{

            public BookCollection(String author, String bookTitle, int publishingYear) {
            super(author, bookTitle, publishingYear);

             String bookCollectionArray []  = {};
        }
    }

    public static void main(String[] args) {
        Books book1 = new Books(" ","",0);

        book1.setAuthor("Sergey Pushkin");
        book1.setBookTitle("Ruslan I ludmila");
        book1.setPublishingYear(1862);

        Books book2 =  new Books("Richard Branson", "The Capital", 2010);
        System.out.println(book2.getAuthor() + " " + book2.getBookTitle() + " " + book2.getPublishingYear());
        System.out.println(book1.getAuthor()+ book1.getBookTitle() +book1.getPublishingYear());

        BookCollection bookCollection = new BookCollection("Hello World", "Unknown", 1234);
        

    }



}
