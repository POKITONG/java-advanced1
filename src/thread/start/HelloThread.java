package thread.start;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": run()");

        // 실행중인 스레드의 이름을 조획 가능
    }
}
