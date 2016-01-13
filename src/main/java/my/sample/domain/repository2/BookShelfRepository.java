package my.sample.domain.repository2;

import java.util.List;

import my.sample.domain.model.BookShelf;

public interface BookShelfRepository {
    List<BookShelf> findByShelfId(String shelfId);
    BookShelf invalidSql(String shelfID);
}
