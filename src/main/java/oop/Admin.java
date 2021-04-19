package oop;

import java.time.LocalDate;

public class Admin extends User {
    private String [] priviliges;
    private String name;
    private String lastname;

    public Admin(String login, String email, String password, LocalDate birthDate, String[] priviliges, String name, String lastname) {
        super(login, email, password, birthDate); // wywołanie konstruktora klasy nadrzędnej
        this.priviliges = priviliges;
        this.name = name;
        this.lastname = lastname;
        System.out.println("Jestem w kontruktorze Admin");
    }

}
