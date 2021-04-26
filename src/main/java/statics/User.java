package statics;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class User {
    public static  int global_id;      // składowe nie są związane z obiektem a z klasą
                                        // pole statyczne nie jest reinicjalizowane przy tworzeniu obiektu
    public static void getInfo(){       // metoda statyczna
        System.out.println(global_id);  // mogę odwoływać się do składowych statycznych
//        System.out.println(id);       // nie mogę się odwoływać do składowych niestatycznych
        User user = new User("X","X");
        user.setId(5);
                                        // może implementować dowolne rozwiązania
    }
    private int id;             // -> 0
    private String name;        // -> null
    private String lastname;    // -> null
    public User(String name, String lastname) {
        global_id++;                    // inkrementacja aktualnej warotści sładowej statycznej
        this.id = global_id;            // inkrementacja zawasze z 0 na 1
        this.name = name;
        this.lastname = lastname;
    }
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Adam","X"));
        users.add(new User("Anna","Y"));
        users.add(new User("Adam","X"));
        users.forEach(System.out::println);
        System.out.println(User.global_id);     // odwołanie bez udziału instancji
        User.getInfo();                         // wywołanie metody bez udziału instancji
        // gotowe realizacje
        LocalDate ldt = LocalDate.now();
        double PI = Math.PI;
    }
}
