package streamAPI;

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
        for(Integer o : userRepository.getUsersGroupingByYears().keySet()){
            System.out.printf("%10s : %100s", o, userRepository.getUsersGroupingByYears().get(o));
        }

    }
}
