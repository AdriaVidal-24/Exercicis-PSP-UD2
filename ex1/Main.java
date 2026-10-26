package ex1;

public class Main {
    public static void main(String[] args) {
        Thread fil1 = new Fil1();
        Thread fil2 = new Fil2();

        fil1.start();
        fil2.start();
    }
}
