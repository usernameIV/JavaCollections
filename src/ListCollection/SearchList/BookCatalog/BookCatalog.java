package ListCollection.SearchList.BookCatalog;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

    private List<Book> bookList;

    public BookCatalog () {
        this.bookList = new ArrayList<>();
    }

    public void addBook (String title, String author, int postYear) {
        bookList.add(new Book(title, author, postYear));
    }

    public List<Book> searchAuthor(String author) {
        List<Book> bookByAuthor = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book bk : bookList) {
                if (bk.getAuthor().equalsIgnoreCase(author)) {
                    bookByAuthor.add(bk);
                }
            }
        }
        return bookByAuthor;
    }

    public List<Book> searchPostYearGap(int postYear, int finalPostYear) {
        List<Book> bookYearsGap = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book bk : bookList) {
                if (bk.getPostYear() >= postYear && bk.getPostYear() <= finalPostYear) {
                    bookYearsGap.add(bk);
                }
            }
        }
        return bookYearsGap;
    }
    public Book searchBookByTitle(String title) {
        Book bookTitle = null;
        if (!bookList.isEmpty()) {
            for (Book bk : bookList) {
                if(bk.getTitle().equalsIgnoreCase(title)) {
                    bookTitle = bk;
                    break;
                }
            }
        }
        return bookTitle;
    }

}












