package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private Integer id;
    private String firstName;
    private String lastName;
    private String Address;
    private LocalDate dateOfBirth;
    private List<Borrowing> borrowings;

    public Member(Integer id, String firstName, String lastName, String address, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Address = address;
        this.dateOfBirth = dateOfBirth;

        borrowings = new ArrayList<Borrowing>();
    }

    public void addBorrowing(Borrowing borrowing) {
        borrowings.add(borrowing);
    }
    public List<Borrowing> getBorrowings() {
        return borrowings;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
