package chater01.synchronized예시;

public class Counter { private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}