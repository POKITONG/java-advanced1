package thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        // 스레드와 작업을 분리 가능, 실무에서는 대부분 runnable 을 사용

        // Thread 클래스 상속 방식
        // 상속의 제한 : 자바는 단일 상속만 허용하므로이미 다른 클래스를 상속받고 있는 경우 Thread 클래스를 상속 받을 수 X.

        // Runnable 인터페이스 구현 방식
        // 상속의 자유로움
        // 코드의 분리 : 스레드와 실행할 작업을 분리해 코드의 가독성을 높임
        // 여러 스레드가 동일한 Runnable 객체를 공유할 수 있어 효율적으로 자원 관리 가능

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
