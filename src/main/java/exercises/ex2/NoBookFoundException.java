package exercises.ex2;

public class NoBookFoundException extends Exception{
    public NoBookFoundException(String bookTitle){
        System.out.println("NoBookFoundException - Nie udało się odnaleźć książki o tytule " + bookTitle);
    }

    public NoBookFoundException(int index){
        System.out.println("NoBookFoundException - Nie udało się odnaleźć książki o indeksie " + index);
    }
}
