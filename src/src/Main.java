import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Book book = new Book("B001", "Clean Code", "Robert C. Martin", "9780132350884", 5);
        book.displayDetails();

        Member member = new Member(101, "Alex Perera", "alex@example.com", "MEM001", 2);
        member.displayDetails();

        Librarian librarian = new Librarian(201, "Sarah Fernando", "sarah@example.com", "EMP001", "Head Librarian");
        librarian.displayDetails();

        Loan loan = new Loan("L001", member, book, LocalDate.of(2026, 10, 16), LocalDate.of(2026, 10, 30));
        loan.displayDetails();
    }
}