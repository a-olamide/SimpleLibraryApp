package model;

import java.time.LocalDate;

public class Borrowing {
    private Member member;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Borrowing(Member member, Book book, LocalDate borrowDate, LocalDate returnDate) {
        this.member = member;
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Borrowing{" +
                "member=" + member.toString() + " " + member.getLastName() +
                ", book=" + book.toString() +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
