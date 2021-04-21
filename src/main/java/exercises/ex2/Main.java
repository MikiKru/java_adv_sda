package exercises.ex2;

public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepositoryImpl();
        bookRepository.addBook("123QWE", "W pustyni i w puszczy", "H.Sienkiewicz", 2010);
        bookRepository.addBook("REWDS1", "Ogniem i mieczem", "H.Sienkiewicz", 2015);
        bookRepository.addBook("433ERT", "Potop", "H.Sienkiewicz", 2011);
        System.out.println(BookRepository.books);
    }
}
