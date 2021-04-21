package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAPINumbers {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,2,1,3,4,5,6,76,454,3,-4,2,3};
        // wypisz liczby parzyste dodatnie
        Arrays.stream(numbers)
                .filter(value -> (value % 2 == 0) && (value > 0))
                .forEach(System.out::println);
        // zwróć wartość maksymalną z tablicy
        Arrays.stream(numbers).max().ifPresentOrElse(
                value -> System.out.println("MAX: " + value),
                () -> System.out.println("NO MAX VALUE - EMPTY LIST"));
        // zwróć sumę wszystkich elementów z tablicy
        System.out.println("SUM: " + Arrays.stream(numbers).sum());
        // zwróć średnią z elementów tablicy
        Arrays.stream(numbers).average().ifPresentOrElse(
                value -> System.out.println("AVG: " + value),
                () -> System.out.println("NO AVG - EMPTY LIST"));
        // grupowanie -> jaka jest krotność występowania poszczególnych liczb
//        System.out.println(Arrays.stream(numbers)
//                .collect(Collectors.groupingBy()));

    }
}
