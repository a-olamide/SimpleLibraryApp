package repository;

import model.Book;

import java.util.List;

public interface BookRepository {
    void addBook(Book book);
    List<Book> getBooks();
}
