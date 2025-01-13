package thread.start.test;

import static thread.start.util.MyLogger.log;

public class ThreadB extends Thread {
    @Override
    public void run() {
        while (true) {
            log("B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
