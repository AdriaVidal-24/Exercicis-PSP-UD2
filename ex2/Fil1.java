package ex2;

public class Fil1 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("TIC");
        }
    }
}