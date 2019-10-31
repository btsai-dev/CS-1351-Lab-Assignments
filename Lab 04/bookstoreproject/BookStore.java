// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Assignment 4 - Aggregation
// Submission Time: 

package bookstoreproject;

import java.util.ArrayList;
import java.util.Collections;

public class BookStore {
    private String address;
    private String name;
    private ArrayList<Book> books = new ArrayList<>();
    
    /**
     * Bookstore constructor
     * @param address - Bookstore address
     * @param name - Bookstore name
     */
    public BookStore(String address, String name)
    {
        this.address = address;
        this.name = name;
    }
    
    /**
     * Add a new book to the class
     * @param newBook - Book to be added
     */
    public void addBook(Book newBook)
    {
        books.add(newBook);
    }
    
    /**
     * Sort books alphabetically by title
     */
    public void sortBooks()
    {
        Collections.sort(books);
    }
    
    /**
     * Lit books in the bookstore in console
     */
    public void listBooks()
    {
        System.out.println("Title          Author         Edition   Price");
        System.out.println("-------------------------------------------------");
        for (Book book : books)
        {
            System.out.println(book.getInfo());
        }
        System.out.println("-------------------------------------------------");
    }
    
}
