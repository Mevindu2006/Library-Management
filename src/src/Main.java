import model.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(
                "B001", "Clean Code",
                "Robert C. Martin",
                "9780132350884", 5
        );

        Member member = new Member(
                101, "Alex Perera",
                "alex@example.com",
                "MEM001", 2
        );

        Librarian librarian = new Librarian(
                201, "Sarah Fernando",
                "sarah@example.com",
                "EMP001", "Head Librarian"
        );

        Loan loan = new Loan(
                "L001", member, book,
                LocalDate.of(2026, 10, 16),
                LocalDate.of(2026, 10, 30)
        );

        Fine fine = new Fine("F001", loan);

        fine.calculateAmount(3);

        System.out.println("===== BEFORE PAYMENT =====");
        fine.displayDetails();

        fine.payFine();

        System.out.println("\n===== AFTER PAYMENT =====");
        fine.displayDetails();

        // Library Management
        Library library = new Library("Colombo Public Library");

        library.addBook(book);
        library.addMember(member);
        library.addLoan(loan);

        System.out.println("\n===== LIBRARY DETAILS =====");
        library.displayDetails();

        System.out.println("\n===== ALL BOOKS =====");
        library.displayAllBooks();

        System.out.println("\n===== ALL MEMBERS =====");
        library.displayAllMembers();

        System.out.println("\n===== ALL LOANS =====");
        library.displayAllLoans();

        Book foundBook = library.searchBookById("B001");

        if (foundBook != null) {
            foundBook.displayDetails();
        } else {
            System.out.println("Book not found!");
        }

        Book missingBook = library.searchBookById("B999");

        if (missingBook != null) {
            missingBook.displayDetails();
        } else {
            System.out.println("Book not found!");
        }

        Member foundMember = library.searchMemberById(101);

        if (foundMember != null) {
            foundMember.displayDetails();
        } else {
            System.out.println("Member not found!");
        }

        Loan foundLoan = library.searchLoanById("L001");

        if (foundLoan != null) {
            foundLoan.displayDetails();
        } else {
            System.out.println("Loan not found!");
        }

        System.out.println("\n===== REMOVE OPERATIONS =====");

        boolean bookRemoved = library.removeBookById("B001");
        System.out.println("Book removed: " + bookRemoved);

        boolean memberRemoved = library.removeMemberById(101);
        System.out.println("Member removed: " + memberRemoved);

        boolean loanRemoved = library.removeLoanById("L001");
        System.out.println("Loan removed: " + loanRemoved);

        System.out.println("\n===== TEST REMOVAL AGAIN =====");

        System.out.println("Book removed: " +
                library.removeBookById("B001"));

        System.out.println("Member removed: " +
                library.removeMemberById(101));

        System.out.println("Loan removed: " +
                library.removeLoanById("L001"));

        System.out.println("\n===== UPDATED LIBRARY DETAILS =====");

        library.displayDetails();

    }
}