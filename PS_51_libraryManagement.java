class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {
        System.out.println("Abailable books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("*" + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.no_of_books; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book) {
        addBook(book);
    }

}

public class PS_51_libraryManagement {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books
        // Array to store issued books
        System.out.println("Welcome to Library Management System.....");

        Library centralLibrary = new Library();
        centralLibrary.addBook("Data Structures and Algorithms in Java");
        centralLibrary.addBook("C++ Programming Language");
        centralLibrary.addBook("Pytrhon Programming");

        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("C++ Programming Language");
        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("C++ Programming Language");
        centralLibrary.showAvailableBooks();
        
    }
}
