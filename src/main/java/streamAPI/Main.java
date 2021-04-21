package streamAPI;

import oop.User;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();
        userRepository.getAllUsers().forEach(System.out::println);
        String email = "c@c.pl";
        userRepository.getUserByEmail(email).ifPresentOrElse(
                user -> System.out.println("Znaleziono: " + user.toString()),
                () -> System.out.println("Nie znaleziono użytkownika " + email)
        );
        System.out.println("SORTOWANIE");
        userRepository.getAllUsersOrderBy("data urodzenia",false).forEach(System.out::println);
        System.out.println("UŻYTKOWNICY");
        System.out.println(userRepository.getUsersInfo());
        System.out.println("GRUPOWANIE");
        Map<Integer, List<User>> groupOfUser = userRepository.getUsersGroupingByYears();
        for(Integer o : groupOfUser.keySet()){
            System.out.printf("%10d : %10d\n", o, groupOfUser.get(o).size());
        }
        System.out.println("SZYFROWANIE");
        userRepository.getUsersWithEncodedPassword("md5")
                .forEach(user -> System.out.println(user.getEmail() + " " + user.getPassword()));
    }
}
