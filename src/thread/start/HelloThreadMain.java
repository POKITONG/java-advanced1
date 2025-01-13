package thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        // Thread thread = Thread.currentThread(); == 현재 실행하는 Thread 객체
        // 메인에서 만들어지므로 자바에서 자동 생성하는 메인 스레드
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.start();
        // start() : 스레드를 실행해주는 아주 특별한 메서드
        // start()를 호출하면 HelloThread 스레드가 run()을 실행
        // !!! run() 메서드가 아니라 반드시 start() 메서드를 호출해야 한다. => 그래야 별도의 스레드에서 run() 코드 실행
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");

        // => 스레드는 순서와 실행 기간을 모두 보장하지 않는다. 이것이 멀티 스레드
    }
}
