package generics.ex2;

public class CountIf {
    public static void main(String[] args) {
//        Zaimplementuj generyczną metodę countIf , która na podstawie tablicy
//        dowolnego typu oraz wskazanej funkcji zliczy liczbę elementów spełniających
//        warunek. Funkcją może być dowolony interfejs zaimplementowany anonimowo.
        Integer [] numbers = {1,2,3,4,5,6,5};
        int count = Utils.countIf(numbers, new Validator<Integer>() {   // klasa anonimowa jest wykorzystywana tylko jeden raz
                                                            // i wtym samym miejcu co wywołanie jest jej implementacja
            @Override
            public boolean validate(Integer integer) {
                return integer % 2 == 0;
            }
        });
        System.out.println("Ilość elementów parzystych: " + count);
        String [] names = {"ALA","ANNA","JAN", "ALA","JAN"};
        // znajdź imion o długości 3
        int counNames = Utils.countIf(names, new Validator<String>() {
            @Override
            public boolean validate(String s) {
                return false;
            }
        });
        System.out.println("Ilość imion 3-znakowych: " + counNames);
    }
}
