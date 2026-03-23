public class Reader {
    private String firstName;
    private String lastName;
    private int cardNumber;
    private int borrowedCount;

    public Reader(String firstName, String lastName, int cardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = 0;
    }

    public void printData() {
        System.out.println("Reader: " + firstName + " " + lastName +
                " | Card Number: " + cardNumber +
                " | Borrowed Books: " + borrowedCount);
    }

    public void increaseBorrowedCount() {
        borrowedCount++;
    }

    public void decreaseBorrowedCount() {
        if (borrowedCount > 0) {
            borrowedCount--;
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}