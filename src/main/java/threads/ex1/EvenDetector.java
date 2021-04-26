package threads.ex1;

import static java.lang.Thread.sleep;

// Napisz program, który równolegle znajdzie liczby parzyste w dwóch
// przedziałach: 1000-2000 oraz 14300-17800
public class EvenDetector {
    public static void printEvenNumber(int number){
        if(number % 2 == 0) {
            System.out.println(Thread.currentThread().getName() + ": " + number);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(
                () -> {
                    for (int i = 1000; i <= 2000; i++) {
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printEvenNumber(i);
                    }
                }, "Thread 1000-2000"
        );
        Thread t2 = new Thread(
                () -> {
                    for (int i = 14300; i <= 17800; i++) {
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printEvenNumber(i);
                    }
                }, "Thread 14300-17800"
        );
        t1.start();
        t2.start();
    }
}
