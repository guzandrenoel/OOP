import java.util.*;

public class CatalogCard implements Comparable<CatalogCard> {
    // Encapsulation
    private int cardID;
    private String bookTitle;
    private String bookAuthor;
    private int yearPublished;
    private String publisher;

    // Constructor
    public CatalogCard(int cardID, String bookTitle, String bookAuthor, int yearPublished, String publisher) {
        this.cardID = cardID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
    }

    // Getters and Setters
    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Display details
    public void displayCard() {
        System.out.println("Card ID: " + cardID);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Publisher: " + publisher);
        System.out.println("---------------------------");
    }





    @Override
    public int compareTo(CatalogCard other) {
        return Integer.compare(this.cardID, other.cardID);
    }
}
