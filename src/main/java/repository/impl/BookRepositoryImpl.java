package repository.impl;

import model.Book;
import repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    private static BookRepositoryImpl instance;
    private final List<Book> books = new ArrayList<Book>();
    private BookRepositoryImpl() {

    }
    public static BookRepository getInstance() {
        if (instance == null || instance.books.isEmpty()) {
            instance = new BookRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }
}
