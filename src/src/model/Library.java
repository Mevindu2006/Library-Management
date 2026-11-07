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


    public Book searchBookById(String bookId){
        System.out.println("\n===== SEARCH BOOK =====");
        for(Book book : books){
            if(book.getBookId().equals(bookId)){
                return book;
            }
        }
        return null;
    }

    public Member searchMemberById(int memberId){
        System.out.println("\n===== SEARCH MEMBER =====");
        for(Member member : members){
            if(member.getId() == memberId){
                return member;
            }
        }
        return null;
    }

    public Loan searchLoanById(String loanId){
        System.out.println("\n===== SEARCH LOAN =====");
        for(Loan loan : loans){
            if(loan.getLoanId().equals(loanId)){
                return loan;
            }
        }
        return null;
    }

    public boolean removeBookById(String bookId){
        System.out.println("\n===== REMOVE BOOK =====");
        for(Book book : books){
            if(book.getBookId().equals(bookId)){
                books.remove(book);
                return true;

            }
        }
        return false;
    }

    public boolean removeMemberById(int memberId){
        System.out.println("\n===== REMOVE MEMBER =====");
        for(Member member : members){
            if(member.getId() == memberId){
                members.remove(member);
                return true;
            }
        }
        return false;
    }

    public boolean removeLoanById(String loanId){
        System.out.println("\n===== REMOVE LOAN =====");
        for(Loan loan : loans){
            if(loan.getLoanId().equals(loanId)){
                loans.remove(loan);
                return true;
            }
        }
        return false;
    }

    public void displayDetails(){
        System.out.println("Library Name: " + getLibraryName());
        System.out.println("Total Books: " + getTotalBooks());
        System.out.println("Total Members: " + getTotalMembers());
        System.out.println("Total Loans: " + getTotalLoans());
    }



}