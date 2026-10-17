package model;

import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private ArrayList<Loan> loans;

    public Library(String libraryName){
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void addMember(Member member){
        this.members.add(member);
    }

    public void addLoan(Loan loan){
        this.loans.add(loan);
    }


    public void displayAllBooks(){
        for(Book book1 : books){
            book1.displayDetails();
        }
    }

    public void displayAllMembers(){
        for(Member member1 : members){
            member1.displayDetails();
        }
    }

    public void displayAllLoans(){
        for(Loan loan1 : loans){
            loan1.displayDetails();
        }
    }

    public int getTotalBooks(){
        return books.size();
    }

    public int getTotalMembers(){
        return members.size();
    }

    public int getTotalLoans(){
        return loans.size();
    }

    public String getLibraryName(){
        return libraryName;
    }

    public void displayDetails(){
        System.out.println("Library Name: " + getLibraryName());
        System.out.println("Total Books: " + getTotalBooks());
        System.out.println("Total Members: " + getTotalMembers());
        System.out.println("Total Loans: " + getTotalLoans());
    }


}