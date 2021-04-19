package oop;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public boolean isActivated(Object o){
        return ((User) o).isStatus();
    }

    public static void main(String[] args) {
//        User user = new User("mk", "mk@mk.pl", "mk", LocalDate.of(2000,5,5));
//        System.out.println(user.toString());
//        Admin admin = new Admin("aa","a@a.pl", "aa", LocalDate.of(2002,2,2),
//                new String[]{"R", "W", "A"}, "Admin", "Admin");
//        admin.setName("Adam");
//        admin.setStatus(false);
//        System.out.println(admin);
        // POLIMORFIZM - wielopostaciowość
        Object u1 = new User("u", "u@u.pl", "u", LocalDate.of(2005, 5, 1));
        System.out.println(u1.getClass().getName());
        Object u2 = new Admin("aa", "a@a.pl", "aa", LocalDate.of(2002, 2, 2),
                new String[]{"R", "W", "A"}, "Admin", "Admin");
        System.out.println(u2.getClass().getName());
        Object u3 = u2;
        ((Admin) u2).setName("XYZ");
        System.out.println(u3.getClass().getName());
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u3.hashCode());
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u1 == u2);
        System.out.println(u2 == u3);

        Main main = new Main();
        ((User) u1).setStatus(false);
        System.out.println(main.isActivated(u1));
        System.out.println(main.isActivated(u2));
        System.out.println(main.isActivated(u3));
        System.out.println(main.isActivated(
                new User("x","x@x.pl","x", LocalDate.of(1999,2,2))
        ));
//        System.out.println(main.isActivated("ABC"));
    }
}
