package ex1;

public class Fil1 extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
                System.out.println("TIC");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}