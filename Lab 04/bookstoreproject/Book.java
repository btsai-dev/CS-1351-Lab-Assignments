// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Assignment 4 - Aggregation
// Submission Time: 

package bookstoreproject;

public class Book implements Comparable<Book>
{
    private String title;
    private String author;
    private int edition;
    private double price;
    
    /**
     * Book constructor
     * @param title - Book title
     * @param author - Book author
     * @param edition - Book edition
     * @param price - Book price
     */
    public Book(String title, String author, int edition, double price)
    {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.price = price;
    }
    
    /**
     * Get information of the book
     * @return Book information
     */
    public String getInfo()
    {
        return String.format("%-10s     %-10s     %-10d%.6f", title.substring(0,10), author.substring(0,10), edition, price);
    }

    /**
     * Gives compatibility with sorting through comparable interface
     * @param book - Book to be compared to
     * @return - 1, 0, or -1
     */
    @Override
    public int compareTo(Book book) {
        return this.title.compareTo(book.title);
    }
}
