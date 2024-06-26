class Book {
    String title;
    String author;
    String isbn;
    static int totalnoofbook;
    boolean isborrowed;

    static {
        totalnoofbook = 0;
    }

    {
        totalnoofbook++;
        isborrowed = false; 
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNOBook() {
        return totalnoofbook;
    }

    void borrowBook() {
        if (isborrowed) {
            System.out.println("Book is already borrowed! name as "+this.title);
        } else {
            this.isborrowed = true;
            System.out.println("Enjoy "+this.title);
        }
    }

    void returnBook() {
        if (isborrowed) {
            this.isborrowed = false;
            System.out.println("Hope you enjoyed it! name as "+this.title);
        } else {
            System.out.println("Book already returned!  name as "+this.title);
        }
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Book design = new Book("xxxxxx21874");
        Book designOfBooks = new Book("xxxxxx985454", "Student Life", "Aditya Devraj");
        System.out.println(Book.getTotalNOBook());
        designOfBooks.borrowBook();
        design.borrowBook();
        designOfBooks.borrowBook();
        designOfBooks.returnBook();
        designOfBooks.returnBook();
        design.borrowBook();
        design.returnBook();
        design.returnBook();
    }
}
