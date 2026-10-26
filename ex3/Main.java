package ex3;

import java.util.concurrent.Semaphore;

public class Main {
    static int comptador = 0;
    static Semaphore mutex = new Semaphore(1);
    public static void main(String[] args) throws InterruptedException {
        Incrementador i1 = new Incrementador(mutex);
        Incrementador i2 = new Incrementador(mutex);

        Thread incrementador1 = new Thread(i1);
        Thread incrementador2 = new Thread(i2);

        incrementador1.start();
        incrementador2.start();
        
        for(int i = 1; i<10000000; i++) {
            incrementador1.run();
            incrementador2.run();
        }
        
        System.out.println(comptador);
    }
}
