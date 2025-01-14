package thread.control;

import thread.start.HelloRunnable;

import static thread.start.util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId() = " + mainThread.threadId());
        //쓰레드 아이디는 자바가 자체적으로 만들고, 중복되지 X 않는다. 쓰레드 이름의 경우 중복 가능
        log("mainThread.getName() = " + mainThread.getName());
        log("mainThread.getPriority() = " + mainThread.getPriority());
        // 우선 순위 = 기본 5.
        // 우선이 높을수록 조금 더 많이 실행됨.운영체제가 잘 최적해서 사용하기 때문에 사용할 일은 별로 없음.
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        // 스레드 그룹:
        // 스레드 그룹은 여러 스레드를 하나의 그룹으로 묶어서 특정 작업 (일괄 종료, 우선순위 등) 을 수행
        // 기본적으로 모든 스레드는 부모 스레드와 동일한 그룹으로 묶이게 된다.
        // 부모 스레드 : 새로운 스레드를 생성하는 스레드. 스레드는 기본적으로 다른 스레드에 의해 생성되기 때문.
        log("mainThread.getState() = " + mainThread.getState());
        // 스레드가 실행될 수 있는 상태인지 아닌지

        /**
         * NEW: 스레드가 아직 시작되지 않은 상태
         * RUNNABLE: 스레드가 실행 중이거나 실행될 준비가 된 상태
         * BLOCKED: 스레드가 동기화 락을 기다리는 상태
         * WAITING: 스레드가 다른 스레드의 특정 작어비 완료되기를 기다리는 상태
         * TIMED_WAITING: 일정 시간 동안 기다리는 상태(sleep)
         * TERMINATED: 스레드가 실행을 마친 상태
         */

        // myThread 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId() = " + myThread.threadId());
        log("myThread.getName() = " + myThread.getName());
        log("myThread.getPriority() = " + myThread.getPriority());
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        log("myThread.getState() = " + myThread.getState());
        // 스레드를 생성하고 아직 실행하지 않았기 때문에 상태는 NEW


    }
}
