package ex2;

public class Main {
    public static void main(String[] args) {
        Fil1 fil1 = new Fil1();
        Fil2 fil2 = new Fil2();
    
        Thread primerThread = new Thread(fil1);
        Thread segonThread = new Thread(fil2);
    
        primerThread.start();
        segonThread.start();
    }
}
