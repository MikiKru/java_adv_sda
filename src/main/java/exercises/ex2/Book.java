package exercises.ex2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
}
