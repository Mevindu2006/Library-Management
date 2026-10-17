package model;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private String isbn;
    private int availableCopies;

    public Book(String bookId, String title, String author, String isbn, int availableCopies){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }

    public void setBookId(String bookId){
        this.bookId = bookId;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setAvailableCopies(int availableCopies){
        this.availableCopies = availableCopies;
    }

    public String getBookId(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getAvailableCopies(){
        return availableCopies;
    }

    public void displayDetails(){
        System.out.println("model.Book ID: " + getBookId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Available copies: " + getAvailableCopies());
    }

}
