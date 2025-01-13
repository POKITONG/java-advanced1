package thread.start.test;

public class StartTest2Main {

    public static void main(String[] args) {
        new Thread(new CounterRunnable()).start();
    }
}
