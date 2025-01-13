package thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.run(); // run() 직접 실행, 메인 스레드 스택 위에 해당 메서드가 올라온다.
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");

        // => 스레드는 순서와 실행 기간을 모두 보장하지 않는다. 이것이 멀티 스레드
    }
}
