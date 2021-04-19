package oop;

import java.time.LocalDate;

public class UserControllerImpl implements UserController {
    @Override   // przysłonięcie
    public void registerUser(User user) {
        for(int i = 0; i < UserController.users.length; i++){
            if(UserController.users[i] == null){  // jeżeli slot jest pusty - null to zapisuje nowego usera
                UserController.users[i] = user;
                break;
            }
        }
    }
    @Override
    public User getUserByEmail(String email) {
        User user = null;
        for(int i = 0; i < UserController.users.length; i++){
           if(UserController.users[i].getEmail().equals(email)){
               user = UserController.users[i];
               return user;
           }
        }
        return user;
    }
    public void getAllRegisteredUsers(){
        for(User u : UserController.users){
            System.out.println(u);
        }
    }
    public static void main(String[] args) {
        UserController userController = new UserControllerImpl();
        userController.registerUser(new User("q","q@q.pl", "q", LocalDate.of(2000,3,3)));
        userController.registerUser(new User("w","w@w.pl", "w", LocalDate.of(2001,3,3)));
        userController.registerUser(new User("e","e@e.pl", "e", LocalDate.of(2002,3,3)));
        userController.registerUser(
                new Admin("a","a@a.pl", "a", LocalDate.of(2002,3,3),
                        null, "Adam", "Kowalski"));
//        System.out.println(userController.getUserByEmail("e@e.pl"));
        ((UserControllerImpl) userController).getAllRegisteredUsers();
    }
}
