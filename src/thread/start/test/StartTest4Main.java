package thread.start.test;

import static thread.start.util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new ThreadA();
        Thread threadB = new ThreadB();

        threadA.start();
        threadB.start();
    }
}
