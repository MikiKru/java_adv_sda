package generics.ex2;

public class Utils {
    // metoda zawierająca obiekty generyczne -> tablica i warunek są generyczne
    public static <T> int countIf(T[] table, Validator<T> validator){
        int count = 0;
        for(int i = 0; i < table.length; i++){
            if(validator.validate(table[i])){    // wykonuje zliczenie pod warunkiem generycznym
                count++;
            }
        }
        return count;
    }
}
