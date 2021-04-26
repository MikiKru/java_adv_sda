package generics.ex5;

import java.util.Arrays;

// Zaprojektuj klasę, która będzie zachowywać się jak dom dla zwierząt:
// ->kot
// ->pies
// Zaproponuj rozwiązanie w oparciu o typy generyczne. W celu przechowywania
// danych skorzystaj z tablic, bądź dowolnego API służącego do przechowywania
// danych.
public class Main {
    public static void main(String[] args) {
        Animal [] animals = {
                new Cat("PERS"),
                new Dog("Rocky"),
                new Dog("Brutus")
        };
        AnimalHouse<Animal> animalHouse = new AnimalHouse<>(animals);
        Arrays.stream(animalHouse.getAnimals()).forEach(System.out::println);
        animalHouse.setAnimals(new Animal[5]);
        Arrays.stream(animalHouse.getAnimals()).forEach(System.out::println);
    }
}
