package streamAPI;

import oop.User;

import java.util.*;
import java.util.stream.Collectors;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> getAllUsers() {
        return users.stream().collect(Collectors.toList());
    }
    @Override
    public List<User> getAllUsersOrderBy(String filedName, boolean isAsc) {
        if(filedName.toUpperCase().equals("data urodzenia".toUpperCase())) {
            if (isAsc) { // rosnąco
                return users.stream()                                       // Stream<User>
                        .sorted(Comparator.comparing(User::getBirthDate))   // Stream<User>
                        .collect(Collectors.toList());                      // List<User>
            }
            // malejąco
            return users.stream()
                    .sorted(Comparator.comparing(User::getBirthDate).reversed())
                    .collect(Collectors.toList());
        // } else if(){ -> dla innych pól
        } else {
            System.out.println("Jeszcze nie sortujemy po takim polu: " + filedName);
            return new ArrayList<>();
        }
    }
    @Override
    public Optional<User> getUserByEmail(String email) {
        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }
    @Override
    public Map getUsersGroupingByYears() {
        return users.stream().collect(Collectors.groupingBy(user -> user.getBirthDate().getYear()));
    }
    @Override
    public String getUsersInfo() {
        return String.format("| %10s | %10s | %10s | %10s |\n", "login", "email", "password", "birthdate") +
                users.stream()
                    .map(user -> String.format(
                            "| %10s | %10s | %10s | %10s |",
                            user.getLogin(), user.getEmail(), user.getPassword(), user.getBirthDate()
                            )
                    )
                    .collect(Collectors.joining("\n"));
    }
    @Override
    public List<User> getUsersWithEncodedPassword(String algorithmName) {
        return null;
    }
}
