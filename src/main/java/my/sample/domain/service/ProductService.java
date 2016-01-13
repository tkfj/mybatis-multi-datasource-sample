package my.sample.domain.service;

import java.util.List;

import my.sample.domain.model.Book;
import my.sample.domain.model.BookShelf;

public interface ProductService {
    Book getBook(String isbn);
    void updateBook(Book book);
    List<BookShelf> getBookShelf(String shelfId);
    void success(String isbn);
    void failure(String isbn);
}
