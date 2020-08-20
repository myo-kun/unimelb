public class Book {
    private String author;
    private String title;
    private boolean borrowed;
    private String borrowedBy;
    private static int numBooksBorrowed;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.borrowed = false;
        this.borrowedBy = "";
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public boolean isBorrowed() {
        return borrowed;
    }
    public String getBorrower() {
        return borrowedBy;
    }
    public void borrow(String borrowedBy) {
        if (this.borrowed) {
            System.out.println("this book is borrowed");
        }
        else {
            this.borrowedBy = borrowedBy;
            this.borrowed = true;
            numBooksBorrowed++;
        }
    }
    public String toString() {
        if (borrowed) {
            return title + " by " + author + " is currently borrowed by " + borrowedBy + ".";
        }
        else {
            return title + " by " + author + "is available.";
        }
    }
    public boolean equals(Book book) {
        return author.equals(book.author)  &&
                title.equals(book.title)  &&
                Boolean.compare(borrowed, book.borrowed) == 0  &&
                borrowedBy.equals(book.borrowedBy);
    }
    public void returnBook() {
        // here
        this.borrowed = false;
        this.borrowedBy = "";
        numBookBorrowed--;
    }

    public static void printNumBooksBorrowed() {
        Systems.out.println("Number of books borrowed is " + numBooksBorrowed);
    }
}
