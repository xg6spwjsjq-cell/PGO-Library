public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Hobbit", "Tolkien", 300, true);
        Book b2 = new Book("Crime and punishment", "Dostoevsky", 250, true);
        Book b3 = new Book("The lord of the Rings", "Tolkien", 1000, true);

        Reader r1 = new Reader("John", "Doe", 12345);
        Reader r2 = new Reader("Jane", "Smith", 67890);

        Library library = new Library(10);
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        b1.printInfo();
        b1.borrow();
        b1.printInfo();
        b1.returnBook();

        b2.printInfo();
        b2.borrow();
        b2.printInfo();
        b2.returnBook();

        b3.printInfo();
        b3.borrow();
        b3.printInfo();
        b3.returnBook();

        System.out.println("\n Initial State ");
        library.printAvailableBooks();
        System.out.println("Total available: " + library.countAvailableBooks());

        System.out.println("\n Borrowing Scenario ");
        library.borrowBook("The Hobbit", r1);
        library.borrowBook("The Hobbit", r2);

        System.out.println("\n State After Borrowing ");
        library.printAvailableBooks();
        r1.printData();

        System.out.println("\n Returning Scenario ");
        library.returnBook("The Hobbit", r1);

        System.out.println("\n Final State ");
        library.printAvailableBooks();
        r1.printData();
    }
}
