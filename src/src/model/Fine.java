package model;

public class Fine {
    private String fineId;
    private Loan loan;
    private double amount;
    private boolean paid;

    public Fine(String fineId, Loan loan){
        this.fineId = fineId;
        this.loan = loan;
        this.amount = 0.0;
        this.paid = false;
    }

    public String getFineId(){
        return fineId;
    }

    public Loan getLoan(){
        return loan;
    }

    public double getAmount(){
        return amount;
    }

    public boolean isPaid(){
        return paid;
    }

    public void calculateAmount(int overdueDays){
        if (overdueDays < 0) {
            System.out.println("Sorry! Negative value.");
            return;
        }

        this.amount = overdueDays * 50;
    }

    public void payFine(){
        paid = true;
    }

    public void displayDetails(){
        System.out.println("model.Fine ID: " + getFineId());
        System.out.println("model.Loan ID: " + getLoan().getLoanId());
        System.out.println("model.Fine Amount: LKR " + getAmount());
        System.out.println("Paid: " + isPaid());
    }


}
