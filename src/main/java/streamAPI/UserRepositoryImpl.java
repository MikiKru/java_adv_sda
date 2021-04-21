package streamAPI;

import oop.User;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
        try {
            MessageDigest md = MessageDigest.getInstance(algorithmName); // Klasa zawierająca algorytmy szyfrujące
            return users.stream()
                    .map(user -> {
                        md.update(user.getPassword().getBytes());        // na istniejącym haśle tworzony jest szyfr
                        String hash = "";
                        for(int i = 0; i < md.digest().length; i++){
                            hash += md.digest()[i];
                        }
                        user.setPassword(hash);                          // aktualizacja hasła
                        return user;                                     // zarócenie użytkownika z zaktualizowanym hasłem
                    })
                    .collect(Collectors.toList());
                    } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
