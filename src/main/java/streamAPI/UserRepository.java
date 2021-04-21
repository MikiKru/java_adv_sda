package streamAPI;

import oop.User;

import java.time.LocalDate;
import java.util.*;

public interface UserRepository {
    List<User> users = new ArrayList<>(Arrays.asList(
            new User("a", "a@a.pl", "a", LocalDate.of(2000,2,13)),
            new User("b", "b@b.pl", "bbbb", LocalDate.of(1999,3,14)),
            new User("c", "c@c.pl", "cc", LocalDate.of(1998,4,16)),
            new User("d", "d@d.pl", "add", LocalDate.of(2000,2,13)),
            new User("e", "e@e.pl", "a32", LocalDate.of(2003,6,1)),
            new User("f", "f@f.pl", "adsa", LocalDate.of(2000,8,1)),
            new User("g", "g@g.pl", "adsa", LocalDate.of(2002,12,1)),
            new User("h", "h@h.pl", "ad", LocalDate.of(2000,11,13)),
            new User("i", "i@i.pl", "a", LocalDate.of(2001,2,10))
    ));
    List<User> getAllUsers();
    // pobiera listę użytkowników posortowanych po filedName, isAsc determinuje typ sortowania
    List<User> getAllUsersOrderBy(String filedName, boolean isAsc);
    // pobierz użytkownika po adresie email
    Optional<User> getUserByEmail(String email);
    // zwróć tabele użytkowników pogrupowanych po roku urodzenia
    // 2000 : 3
    // 1999 : 1
    // ....
    Map<Integer, User> getUsersGroupingByYears();
    // Zwróć dane o użytkownikach w typie string jak poniżej:
    // login | email | password | bithDate |
    // ...   | ...   | ....     | ...      |
    String getUsersInfo();
    // zwróć listę użytkowników z hasłem zaszyfrowanym wybranym algorytmem
    List<User> getUsersWithEncodedPassword(String algorithmName);

}
