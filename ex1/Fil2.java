package ex1;

public class Fil2 extends Thread {
    @Override
    public void run() {
        try {
            sleep(200);
            while (true) {
                System.out.println("TAC");
                sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
