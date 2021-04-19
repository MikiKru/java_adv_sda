package oop;
// wszystkie metody są publiczne i abstrakcyjne
// pola są statyczne i finalne
// !!! Nie można utworzyć obiektu typu interfejsu !!!
public interface UserController {
    // pola statyczne i finalne
    public static final User [] users = new User[10];

    // metoda abstakcyjna posiada tylko sygnaturę - bez implementacji
    public abstract void registerUser(User user);
    // w dmyśle abstrakcyjna i publiczna
    User getUserByEmail(String email);
}
