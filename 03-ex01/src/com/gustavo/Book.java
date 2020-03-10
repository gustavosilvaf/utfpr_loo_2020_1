package com.gustavo;

public class Book {
    /**
     * A class that maintains information on a book.
     * This might form part of a larger application such
     * as a library system, for instance.
     *
     * @author (Gustavo Silva)
     * @version (1.0)
     */

    private String author;
    private String title;
    private int pages, borrowed;
    private String numReference;


    /**
     *
     * @param bookAuthor is the Author's book
     * @param bookTitle is the book Title
     * @param bookPages is the number of pages
     */

    public Book(String bookAuthor, String bookTitle, int bookPages){
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        numReference = "";
    }


    /**
     *
     * @return returns the author's name
     */
    public String printAuthor(){
        return author;
    }

    /**
     *
     * @return return the book's title
     */
    public String printTitle(){
        return title;
    }

    /**
     * When the printDetails method is called, it shows the book information in detail
     */

    public void printDetails(){
        System.out.printf("Title: " + title
                + ". Author: " + author
                + ". Pages: " + pages + ".");
        if (numReference.length() != 0)
            System.out.printf(" Number reference: " + numReference);
        System.out.printf(" Number of loans: " + borrowed);

        System.out.println();

    }

    /**
     *
     * @return the number of loans
     */

    public int getBorrowed(){
        return borrowed;
    }

    /**
     * When called, the method iterates the loan count in one
     */

    public void loan(){
        borrowed++;
    }

    /**
     *
     * @param ref passes the reference number
     * when called, passes a reference number and validates if it has more than three characters
     */

    public void setNumReference(String ref){
        if (ref.length() > 2)
            numReference = ref;
        else
            System.err.println("Reference number must be more than three characters");
    }

}
