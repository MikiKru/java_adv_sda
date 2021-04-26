package exercises.warm_up.ex3;

public class MathPower {
    public static int power(int x, int y){
        // 2^4 = 2*2*2*2
        // x^y = x*x*...*x -> y razy
        int result = 1;
        for(int i = 0; i < y; i++) {
            result *= x; // result = result * x
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 4;
        int y = 2;
        System.out.printf("%d^%d=%d",x, y, power(x,y));
    }
}
