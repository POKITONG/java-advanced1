package thread.start;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // 데몬 스레드 여부 설정, 기본적으로 false
        daemonThread.start();
        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    // => 데몬스레드는 자바의 종료에 영향을 미치지 X, 유저 스레드가 전부 종료되면 자바는 종료
    // 데몬 스레드의 여부는 start() 실행 전에 결정헤야함. 이후에는 변경되지 X.

    static class DaemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run()");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Thread.sleep : 스레드를 기다리게 하는 메서드
            // !!! run() 메서드는 throws 사용할 수 없다 => 부모 메서드가 예외를 정의하지 않기 때문
            // InterruptedException 은 밖으로 던질수가 없음

            System.out.println(Thread.currentThread().getName() + ": run() end");

        }
    }
}
