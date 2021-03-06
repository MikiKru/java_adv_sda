package enums;

import lombok.Getter;

@Getter
public enum Category {
    PROGRAMMING("programowanie"),
    DEV_OPS("administracja"),
    SCRUM("scrum"),
    TESTING("testowanie"),
    OTHER("inne");

    private final String name;

    Category(String name) {
        this.name = name;
    }
}
