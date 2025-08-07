package chater01.synchronized예시;

public class CounterMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // 스레드 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        // 스레드 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start(); // 동시에 실행
        t1.join();
        t2.join();

        System.out.println("최종 카운트: " + counter.getCount()); // 20000 보장됨
    }
}