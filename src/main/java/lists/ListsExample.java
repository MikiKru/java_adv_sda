package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>(Arrays.asList("ALA", "JAN", "EWA"));
        names.add("ALA");
        names.add("OLA");
        names.add("ELA");
        names.add("ALA");
        names.add("ALAN");
        // dodawanie elementów do listy
        names.add(1, "MICHAŁ");
        names.addAll(names2);
        // pobieranie eleemntów z listy
        System.out.printf("index: %d wartość: %s\n", 5, names.get(5));
        System.out.printf("index: %d wartość: %s\n", names.size() - 1, names.get(names.size() - 1));
        // edycja
        names.set(5, "TOMASZ");
//        names.set(15, "TOMASZ");
        System.out.println(names);
    }
}
