package oop;

import java.time.LocalDate;
import java.time.LocalDateTime;

// klasa modelu - klasa determinująca strukturę danych
// klasa modelu -> model JavaBeans
// -> prywtne pola klasowe
// -> konstruktor/y
// -> publiczne metody dostępowe do pól klasowych -> gettery i settery
// -> toString()
public class User {
    // pola klasowe - prywatne
    private String login;
    private String email;
    private String password;
    private LocalDate birthDate;
    private LocalDateTime registrationDateTime;
    private boolean status;
    // konstruktor
    public User(String login, String email, String password, LocalDate birthDate) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
        this.registrationDateTime = LocalDateTime.now();
        this.status = true;
//        System.out.println("Jestem w kontruktorze User!");
    }
    // toString
    @Override // przysłonięcie implementacji z nadklasy Object
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
                ", birthDate=" + birthDate +
                ", registrationDateTime=" + registrationDateTime +
                ", status=" + status +
                '}';
    }
    // metody
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }
    public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
