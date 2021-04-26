package generics.ex3;

import java.util.Arrays;

// Zaimplementuj generyczną metodę swap , która będzie odpowiedzialna za
// zamianę pozycji wskazanych elementów tablicy.
public class SwapOperation {
    public static <T> void swap(T[] table, int index1, int index2){
        try {
            T element = table[index1];
            table[index1] = table[index2];      // wartość na ind2 aktualizuje wartość na ind1
            table[index2] = element;            // wartość na ind1 aktualizuje wartość obiektu element
        } catch(ArrayIndexOutOfBoundsException ex){
            System.err.println("Błąd indeksowania tablicy");
            System.err.println("Nie wykonano operacji SWAP");
        }
    }

    public static void main(String[] args) {
        String [] names = {"ALA", "ANNA", "JAN"};
        swap(names,0,25);
        Arrays.stream(names).forEach(System.out::println);
    }
}
