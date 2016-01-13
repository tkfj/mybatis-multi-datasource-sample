package my.sample.domain.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class BookShelf implements Serializable {
    private static final long serialVersionUID = -7003704026056171806L;
    private String shelfId;
    private String isbn;
}
