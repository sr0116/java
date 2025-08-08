package chater01.ArrayList와Arrays;

public class TimeExample {
    public static void main(String[] args) {
        Time t = new Time();

        t.setHour(13);
        t.setMinute(45);
        t.setSecond(30.5f);

        System.out.println(t); // toString() 자동 호출됨
    }
}
