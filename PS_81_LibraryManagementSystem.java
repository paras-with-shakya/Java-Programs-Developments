import java.util.ArrayList;

class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary {
    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    // Methods to add book, issue book, return book
    public void addBook(Book book) {
        System.out.println("The Book has been added to the library");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to) {
        System.out.println("The Book has been issued to  the library " + issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book b) {
        System.out.println("The Book has been returned to the library");
        this.books.add(b);
    }
}

public class PS_81_LibraryManagementSystem {
    public static void main(String[] args) {
        /*
         * Create a Library Management System which is capable of issuing Books to the
         * Students.
         * Book should have informetion like
         * 1. Book Name
         * 2. Book Author name
         * 3. issued to (Student name)
         * 4. Issued On (Date)
         * User should be able to add Books , return issued Book , issue Books
         * Assume that All the user are registered with there name in the central
         * Database.
         * Design the classes and methods to implement the functionality.
         */

        // Solve Exercise Yourself
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Java Programming", "XYZ");
        bk.add(b1);
         Book b2 = new Book("C Programming", "ABC");
        bk.add(b2);
         Book b3 = new Book("C++ Programming", "DEF");
        bk.add(b3);
         Book b4 = new Book("Python Programming", "GHI");
        bk.add(b4);
        MyLibrary ml = new MyLibrary(bk);
        ml.addBook(new Book("AI", "JKL"));
        System.out.println(ml.books);
        ml.issueBook(b1, "Paras Shakya");
         System.out.println(ml.books);

    }

}
