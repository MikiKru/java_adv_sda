package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPIIntroduction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("ALA","OLA","ELA","ALA","JAN","ADAM","JAN"));
        // CTRL + Space -> generowanie predykatu
        // STREAM API -> tylko z operacją kończącą foreach
        names                   // kolekcja List<String>
            .stream()           // strumień Stream<String>
                .forEach(name -> System.out.println(name.toLowerCase()));
                                // dla każdego elementu strumienia wykonaj przekształcenie
                                // void - strumień zamknięty
        names.forEach(System.out::println);
        // wypisz imiona żeńskie, czyli kończące się na a
        System.out.println("Imiona żeńskie");
//        for(String name : names){
//            if(name.toUpperCase().charAt(name.length() - 1) == 'A'){
//                System.out.println(name);
//            }
//        }
        // CTRL + Space
        names.stream()                                                                  // Stream<String>
                .filter(name -> name.toUpperCase().charAt(name.length() - 1) == 'A')    // Stream<String> po filtrowaniu
                .forEach(name -> System.out.println(name));
        // wypisz imiona żeńskie, ale przed każdym z nich dodaj napis kobieta:
        names.stream()
                .filter(name -> name.toUpperCase().charAt(name.length() - 1) == 'A')
                .forEach(name -> System.out.println("kobieta: " + name));
        names.stream()
                .filter(name -> name.toUpperCase().charAt(name.length() - 1) == 'A')
                .map(name -> "kobieta: " + name)
                .forEach(name -> System.out.println(name));
    }
}
