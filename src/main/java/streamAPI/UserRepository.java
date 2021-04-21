package streamAPI;

import oop.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface UserRepository {
    List<User> users = new ArrayList<>(Arrays.asList(
            new User("a", "a@a.pl", "a", LocalDate.of(2000,2,13)),
            new User("b", "b@b.pl", "bbbb", LocalDate.of(1999,3,14)),
            new User("c", "c@c.pl", "cc", LocalDate.of(1998,4,16)),
            new User("d", "d@d.pl", "add", LocalDate.of(2000,2,13)),
            new User("e", "e@e.pl", "a32", LocalDate.of(2003,6,1)),
            new User("f", "f@f.pl", "adsa", LocalDate.of(2000,,81)),
            new User("g", "g@g.pl", "adsa", LocalDate.of(2002,12,1)),
            new User("h", "h@h.pl", "ad", LocalDate.of(2000,11,13)),
            new User("i", "i@i.pl", "a", LocalDate.of(2001,2,10))
    ));
}
