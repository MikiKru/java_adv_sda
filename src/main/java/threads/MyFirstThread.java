package threads;

// każda klasa wątku rozszerza klasę thread
public class MyFirstThread extends Thread {
    @Override
    public void run(){
        // gdy wątek jest uruchomiony wykonywana jest metoda run()
        for(int i = 0; i < 60; i++){
            try {
//            Thread.currentThread().getName() -> zwraca nazwę wątku
            System.out.println("Wątek: " + Thread.currentThread().getName());
//            Thread.sleep(1000);   -> uśpienie wątku na 1s (WAITING)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // gdy metoda run się wykona to wątek przechodzi w stan TERMINATED
    }
}
