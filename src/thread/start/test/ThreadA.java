package thread.start.test;

import static thread.start.util.MyLogger.log;

public class ThreadA extends Thread {
    @Override
    public void run() {
        while (true) {
            log("A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
