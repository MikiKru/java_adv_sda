package streamAPI;

import oop.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> getAllUsers() {
        return UserRepository.users.stream().collect(Collectors.toList());
    }
    @Override
    public List<User> getAllUsersOrderBy(String filedName, boolean isAsc) {
        return null;
    }
    @Override
    public Optional<User> getUserByEmail(String email) {
        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }
    @Override
    public Map<Integer, User> getUsersGroupingByYears() {
        return null;
    }
    @Override
    public String getUsersInfo() {
        return null;
    }
    @Override
    public List<User> getUsersWithEncodedPassword(String algorithmName) {
        return null;
    }
}
