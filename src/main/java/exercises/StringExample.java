package exercises;

public class StringExample {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);          // s1 = JavaLove - metoda łączy dwa napisy i aktualizuje s1
        System.out.println(s1);
        s1.substring(4);   // s1 = JavaLove - metoda zwraca podciąg
        System.out.println(s1);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);

    }
}
