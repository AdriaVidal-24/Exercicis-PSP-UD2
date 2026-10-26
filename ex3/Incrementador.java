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
            mutex.acquire();
            for(int i = 0; i<100; i++) {
                Main.comptador++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            mutex.release();
        }
    }
    
}
