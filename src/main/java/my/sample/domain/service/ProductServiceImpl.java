package my.sample.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import my.sample.domain.model.Book;
import my.sample.domain.model.BookShelf;
import my.sample.domain.repository.BookRepository;
import my.sample.domain.repository2.BookShelfRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookShelfRepository bookShelfRepository;

    @Transactional
    public Book getBook(String id) {
        return bookRepository.findOne(id);
    }

    @Transactional
    public void updateBook(Book book) {

        if (bookRepository.update(book) != 1) {
            throw new BusinessException("更新件数が1件以上あった");
        }

    }

    public List<BookShelf> getBookShelf(String shelfId) {
        return bookShelfRepository.findByShelfId(shelfId);
    }

    @Transactional
    public void success(String isbn) {

        Book book = bookRepository.findOne(isbn);
        book.setTitle("xxxxxxxx");
        if (bookRepository.update(book) != 1) {
            throw new BusinessException("更新件数が1件以上あった");
        }
        bookShelfRepository.findByShelfId("0000000001");
    }

    @Transactional
    public void failure(String isbn) {

        Book book = bookRepository.findOne(isbn);
        book.setTitle("xxxxxxxx");
        if (bookRepository.update(book) != 1) {
            throw new BusinessException("更新件数が1件以上あった");
        }
        bookShelfRepository.invalidSql("0000000001");
    }

}