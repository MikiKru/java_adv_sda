package exceptions;

// każda klasa wyjątku musi rozszerzać nadklasę Exception
public class CantTouchThis extends Exception {
    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println("To jest mój wyjątek - nie można indeksować 0");
    }
}
