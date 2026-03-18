public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Hobbit", "Tolkien", 300, true),
        Book b2 = new Book("Crime and punishment", "Dostoevsky", 250, true),
        Book b3 = new Book("The lord of the Rings", "Tolkien", 1000, true)

        b1.printInfo();
        b1.borrow();
        b1.printInfro();
        b1.returnBook();

        b2.printInfo();
        b2.borrow();
        b2.printInfro();
        b2.returnBook();

        b3.printInfo();
        b3.borrow();
        b3.printInfro();
        b3.returnBook();
    }
}
