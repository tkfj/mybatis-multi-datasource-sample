package my.sample.domain.repository;

import my.sample.domain.model.Book;

public interface BookRepository {
    Book findOne(String id);
    int update(Book book);
}
