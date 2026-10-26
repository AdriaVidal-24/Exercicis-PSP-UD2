package ex3;

import java.util.concurrent.Semaphore;

public class Incrementador implements Runnable{
    Semaphore mutex;
    
    public Incrementador(Semaphore mutex) {
        this.mutex = mutex;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i<1000000; i++) {
                mutex.acquire();
                Main.comptador++;
                mutex.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
