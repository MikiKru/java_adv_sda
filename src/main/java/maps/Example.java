package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    private final List<Integer> elements = new ArrayList<>(Arrays.asList(1,2,3));

    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.hashCode());
        example.elements.add(4);
        example.elements.remove(0);
        System.out.println(example.elements);
        System.out.println(example.hashCode());
//        example.elements = new ArrayList<>();

    }

}
