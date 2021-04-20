package exercises.ex1;

public class Ex1 {
    //    Zaimplementuj metodę divide , która docelowo ma podzielić dwie liczby
//    będące atrybutami metody. W przypadku, gdy drugi parametr metody jest równy
//    0, powinien zostać wyrzucony niedomyślny wyjątek:
//    CannotDivideBy0Exception .
    public static Double divide(int num1, int num2) {
        try {
            if (num2 == 0) {
                throw new CannotDivideBy0Exception();
            }
            return (double)num1 / num2;
        } catch (CannotDivideBy0Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println(divide(1,2));
        System.out.println(divide(1,0));
        System.out.println(divide(1,10));
    }

}
