package ListCollection.SearchList.NumberSum;

import ListCollection.SearchList.BookCatalog.BookCatalog;

public class BookCatalogMain {
    public static void main(String[] args) {

        BookCatalog catalog = new BookCatalog();

        catalog.addBook("Book 1", "Author 1", 2020);
        catalog.addBook("Book 1", "Author 2", 2021);
        catalog.addBook("Book 2", "Author 2", 2022);
        catalog.addBook("Book 3", "Author 3", 2023);
        catalog.addBook("Book 4", "Author 4", 1994);


        System.out.println(catalog.searchAuthor("Author 2"));
        System.out.println("Books in between gap by year searched: \n" + catalog.searchPostYearGap(2020, 2022));
        System.out.println("\nResult of search by title:r" + catalog.searchBookByTitle("Book 1"));

    }
}
