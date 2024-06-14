package ListCollection.SearchList.BookCatalog;

public class Book {

    private String title;
    private String author;
    private int postYear;

    public Book (String title, String author, int postYear) {
        this.title=title;
        this.author=author;
        this.postYear=postYear;
    }
    public String getTitle () {
        return title;
    }
    public String getAuthor () {
        return author;
    }
    public int getPostYear () {
        return postYear;
    }

    @Override
    public String toString() {
        return "\nBook ↓ "
            + '\n' + "title: " + title
            + '\n' + "autor: " + author
            + '\n' + "postYear: " + postYear + '\n';
    }
}
