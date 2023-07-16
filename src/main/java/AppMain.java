public class AppMain {
    public static void main(String args[]) {
        Thread t;
        t = new Thread();
        t.start();
        synchronized (t) {
            t.start();
        }
    }
}