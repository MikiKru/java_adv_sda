package threads;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // tutaj program wykonywany jest w wątku głównym main
        System.out.println("MAIN: " + Thread.currentThread().getName());
        MyFirstThread myFirstThread1 = new MyFirstThread();
        MyFirstThread myFirstThread2 = new MyFirstThread("ALPHA");
        // uruchomienie wątków odbywa się za pomocą wywołania metody
        myFirstThread1.start();     // alokacja zasobów sprzetowych dla wątku mft1
        myFirstThread2.start();     // alokacja zasobów sprzetowych dla wątku mft2
        System.out.println("MAIN: " + Thread.currentThread().getName());
        // implementacja klasy wątku w klasie anonimowej
        Thread threadBasedOnRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                String[] names = {"TASK A", "TASK B", "TASK C", "TASK D"};
                // generator czasu usupiania wątku
                Random random = new Random();
                for (String name : names) {
                    try {
                        int randomTime = random.nextInt(5) + 1;      // losowe wartości natualne z zakresu 1:5
                        Thread.sleep(randomTime * 1000);
                        System.out.println(name + " : " +
                                Thread.currentThread().getName() +
                                "time to solve: " + randomTime + "s");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "threadBasedOnRunnable");
        threadBasedOnRunnable.start();
        // thread with lambda
        Thread threadBasedOnLambda = new Thread(
                // implementacja metody run
                () -> {
                    for (int i = 0; i < 10; i++) {
                        try {
                            System.out.println("Hello!");
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
        threadBasedOnLambda.start();
    }
}
