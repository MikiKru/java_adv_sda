package exercises.ex2;

import java.util.ArrayList;
import java.util.List;

public interface BookRepository {
    List<Book> books = new ArrayList<>();

    void addBook(String isbn, String title, String author, int publicationDate);
    Book getBookByTitle(String title);
    Book getBookByIndex(int index);
    void removeBook(int index);
}
