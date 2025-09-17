// Abstract class
abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public abstract String getType();
}

// Book subclass
class Book extends LibraryResource {
    public Book(String title, String author) { super(title, author); }

    @Override
    public String getType() { return "Book"; }
}

// DVD subclass
class DVD extends LibraryResource {
    public DVD(String title, String author) { super(title, author); }

    @Override
    public String getType() { return "DVD"; }
}

// Test class
public class LibrarySystem {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "Alice");
        DVD d = new DVD("Movie Night", "Bob");

        System.out.println(b.getTitle() + " is a " + b.getType());
        System.out.println(d.getTitle() + " is a " + d.getType());
    }
}
