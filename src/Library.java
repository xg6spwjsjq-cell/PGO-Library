public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void printAvailableBooks() {
        System.out.println(" Available Books ");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println("- " + books[i].getTitle());
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public void borrowBook(String title, Reader reader) {
        Book book = findBookByTitle(title);
        if (book != null && book.isAvailable()) {
            book.borrow();
            reader.increaseBorrowedCount();
            System.out.println(reader.getFullName() + " successfully borrowed '" + title + "'.");
        } else {
            System.out.println("Sorry, '" + title + "' is not available.");
        }
    }

    public void returnBook(String title, Reader reader) {
        Book book = findBookByTitle(title);
        if (book != null && !book.isAvailable()) {
            book.returnBook();
            reader.decreaseBorrowedCount();
            System.out.println(reader.getFullName() + " successfully returned '" + title + "'.");
        } else {
            System.out.println("Cannot return '" + title + "'. It wasn't borrowed or doesn't exist.");
        }
    }
}