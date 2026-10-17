package model;

import java.time.LocalDate;

public class Loan {
    private String loanId;
    private Member member;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate dueDate;

    public Loan(String loanId, Member member, Book book, LocalDate borrowDate, LocalDate dueDate){
        this.loanId = loanId;
        this.member = member;
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public String getLoanId(){
        return loanId;
    }

    public Member getMember(){
        return member;
    }

    public Book getBook(){
        return book;
    }

    public LocalDate getBorrowDate(){
        return borrowDate;
    }

    public LocalDate getDueDate(){
        return dueDate;
    }

    private LocalDate returnDate;

    public void returnBook(LocalDate returnDate){
        this.returnDate = returnDate;
    }

    public boolean isOverdue(LocalDate currentDate){
        return returnDate == null && currentDate.isAfter(dueDate);
    }

    public void displayDetails(){
        System.out.println(getLoanId());
        System.out.println("model.Member: " + getMember());
        System.out.println("model.Book: " + getBook());
        System.out.println(getBorrowDate());
        System.out.println(getDueDate());
        System.out.println(returnDate);
    }





}
