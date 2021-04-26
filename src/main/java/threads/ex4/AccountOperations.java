package threads.ex4;

import lombok.AllArgsConstructor;

import java.util.Random;

@AllArgsConstructor
public class AccountOperations {
    private Accout accout;

    public double getAmount(){
        return accout.getAmount();
    }
    public void cacheIn(double amount){
        accout.setAmount(accout.getAmount() + amount);
        System.out.println("Zasilono konto! Twoje Saldo: " + getAmount());
    }
    // synchronized - pozwala na wykonywanie metody w całości tylko dla jednego wątku
    // powoduje tworzenie sekcji krytycznej
    public synchronized void cacheOut(double amount){
        if(amount <= accout.getAmount()) {
            accout.setAmount(accout.getAmount() - amount);
            System.out.println("Wykonano przelew wychodzący! Twoje saldo: "+getAmount());
        } else {
            System.out.println("Nie możesz wypłacić kwoty: " + amount + " Twoje saldo: " + getAmount());
        }
    }
    public static void main(String[] args) {
        Accout accout = new Accout(1000);
        AccountOperations ac = new AccountOperations(accout);
        Thread cacheIn = new Thread(() -> {
            Random random = new Random();
            for(int i = 0; i < 10; i++){
                ac.cacheIn(random.nextInt(1000));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread cacheOut = new Thread(() -> {
            Random random = new Random();
            for(int i = 0; i < 12; i++){
                ac.cacheOut(random.nextInt(1000));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread cacheOut2 = new Thread(() -> {
            Random random = new Random();
            for(int i = 0; i < 12; i++){
                ac.cacheOut(random.nextInt(1000));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        cacheIn.start();
        cacheOut.start();
        cacheOut2.start();
    }
}
