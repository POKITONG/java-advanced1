package thread.start.test;

import static thread.start.util.MyLogger.log;

public class StartTest2Main {

    public static void main(String[] args) {
//        new Thread(new CounterRunnable()).start();
        Thread thread = new Thread(new CounterRunnable(), "counter");
        thread.start();

    }

    static class CounterRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log("value: " + i);
            }
        }
    }
}
