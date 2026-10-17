package model;

public class Member extends Person{
    private String membershipId;
    private int borrowedBooksCount;

    public Member(int id, String name, String email, String membershipId, int borrowedBooksCount){
        super(id, name, email);
        this.membershipId = membershipId;
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public void setMembershipId(String membershipId){
        this.membershipId = membershipId;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount){
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public String getMembershipId(){
        return membershipId;
    }

    public int getBorrowedBooksCount(){
        return borrowedBooksCount;
    }

    @Override
    public void displayDetails(){
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Membership: " + getMembershipId());
        System.out.println("Borrowed books count: " + getBorrowedBooksCount());
    }

}
