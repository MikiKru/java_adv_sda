package exercises.ex2;

public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepositoryImpl();
        bookRepository.addBook("123QWE", "W pustyni i w puszczy", "H.Sienkiewicz", 2010);
        bookRepository.addBook("REWDS1", "Ogniem i mieczem", "H.Sienkiewicz", 2015);
        bookRepository.addBook("433ERT", "Potop", "H.Sienkiewicz", 2011);
        System.out.println(BookRepository.books);
        System.out.println("Czy jest potop? " + bookRepository.getBookByTitle("Potop"));
        System.out.println("Czy jest władca pierścieni? " + bookRepository.getBookByTitle("Władca pierscieni"));
        System.out.println("INDEX 1: " + bookRepository.getBookByIndex(1));
        System.out.println("INDEX 10: " + bookRepository.getBookByIndex(10));
        bookRepository.removeBook(0);
        bookRepository.removeBook(5);
        System.out.println(BookRepository.books);
    }
}
