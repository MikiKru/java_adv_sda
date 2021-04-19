package oop;

import lombok.*;

import java.time.LocalDate;
import java.util.Arrays;

//@Data     // automatycznie dodaje gettery, settery i toString w kodzie klasy
@Getter     // automatycznie dodaje gettery w kodzie klasy
@Setter     // automatycznie dodaje settery w kodzie klasy
@ToString   // automatycznie dodaje toString w kodzie klasy
//@NoArgsConstructor  // automatycznie dodaje domyślny konstruktor w kodzie klasy
//@AllArgsConstructor // automatycznie dodaje konstruktor z wszystkimi polami klasowymi jako argumenty w kodzie klasy
public class Admin extends User {
    private String [] priviliges;
    private String name;
    private String lastname;

    public Admin(String login, String email, String password, LocalDate birthDate, String[] priviliges, String name, String lastname) {
        super(login, email, password, birthDate); // wywołanie konstruktora klasy nadrzędnej
        this.priviliges = priviliges;
        this.name = name;
        this.lastname = lastname;
//        super.login = "A";  // nie dziedziczemy składowych prywatnych
        System.out.println("Jestem w kontruktorze Admin");
    }
    // ALT + Ins
    @Override
    public String toString() {
        return "Admin{" +
                "priviliges=" + Arrays.toString(priviliges) +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                "} " + super.toString(); // wywołanie metody z klasy nadrzędnej
    }

}
