package streamAPI;

import java.util.Arrays;

public class StreamAPINumbers {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,2,1,3,4,5,6,76,454,3,-4,2,3};
        // wypisz liczby parzyste dodatnie
        Arrays.stream(numbers)
                .filter(value -> (value % 2 == 0) && (value > 0))
                .forEach(System.out::println);
    }
}
