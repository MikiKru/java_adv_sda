package exercises.ex2;

// CTRL + ALT + L - autoformatowanie
// CTRL + LPM - przejście do deklaracji składowej
public class BookRepositoryImpl implements BookRepository {
    @Override
    public void addBook(String isbn, String title, String author, int publicationDate) {
        books.add(new Book(isbn, title, author, publicationDate));
    }
    @Override
    public Book getBookByTitle(String title) {
        // foreach -> do odczytu
        // for -> do zadań RW gdy znana jest ilośc iteracji
        // while -> do zadań gdy niezana jest ilość iteracji
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
    @Override
    public Book getBookByIndex(int index) {
        for (Book book : books) {
            if (books.indexOf(book) == index) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void removeBook(int index) {

    }
}
