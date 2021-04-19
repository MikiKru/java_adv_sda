package oop;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                "mk",
                "mk@mk.pl",
                "mk",
                LocalDate.of(2000,5,5));
        System.out.println(user.toString());
        Admin admin = new Admin("aa","a@a.pl", "aa", LocalDate.of(2002,2,2),
                new String[]{"R", "W", "A"}, "Admin", "Admin");
    }
}
