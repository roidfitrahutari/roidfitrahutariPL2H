package Exceptions;
public class Threads {
    public void run() {
        System.out.println("Hello");
    }

    public static void main(String[ ] args) {
        Threads object = new Threads();
        object.start();
    }

    private void start() {
    }
}
