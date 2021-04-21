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
        Book foundBook = null;      // wartość domyślna - nie znaleziono
        try {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    foundBook = book;   // jeśli znaleziono to zmieniam wartość domyślną
                }
            }
            if (foundBook == null) {      // sprawdzenie czy znaleziono książkę po wszystkich iteracjach
                throw new NoBookFoundException(title);  // zgłoszenie wyjątku
            }
        } catch (NoBookFoundException ex) {               // obsługa wyjątku
            ex.printStackTrace();
        }
        return foundBook;
    }

    @Override
    public Book getBookByIndex(int index) {
        Book foundBook = null;
        try {
            for (Book book : books) {
                if (books.indexOf(book) == index) {
                    foundBook = book;
                }
            }
            if (foundBook == null) {
                throw new NoBookFoundException(index);
            }
        } catch (NoBookFoundException ex) {
            ex.printStackTrace();
        }
        return foundBook;
    }

    @Override
    public void removeBook(int index) {
        try {
            Book foundBook = null;
            for (Book searchedBook : books) {
                if (books.indexOf(searchedBook) == index) {
                    foundBook = searchedBook;
                    books.remove(searchedBook);
                }
            }
            if (foundBook == null) {
                throw new NoBookFoundException(index);
            }
        } catch (NoBookFoundException ex) {
            ex.printStackTrace();
        }
    }
}
