package threads;

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
    }
}
