package generics;

import lombok.AllArgsConstructor;
import lombok.Data;
import statics.User;

@AllArgsConstructor
@Data
public class Pair <K, V> {
    private K key;
    private V value;

    public static void main(String[] args) {
        // tworzenie obiektu klasy generycznej
        Pair<String, Integer> pair1 = new Pair("X",1);
        Pair pair2 = new Pair(2.3,1);               // od JDK8.X nie trzeba determinować typów generica
        Pair<Integer, User> pair3 = new Pair(1, new User("x","x"));
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }
}
