public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }

    public void printInfo() {
        System.out.println(title + "by" + author + )
                "Pages: " + pageCount +
                "Available: " avaiable);
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println("Book is not avaiable.");
        }
    }

    public void returtBook() {
        available = true;
        System.out.println("You returned: " + title);
    }

    public boolean isAvailable() {
        return available;
    }

    public String getTitle() {
        return title;
    }
}
