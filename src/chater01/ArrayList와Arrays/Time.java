package chater01.ArrayList와Arrays;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Time {
    private int hour;
    private int minute;
    private float second;

//    public Time() {} // ✅ 기본 생성자

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public float getSecond() {
        return second;
    }

    public void setHour(int h) {
        if (h < 0 || h > 24) return;
        hour = h;
    }

    public void setMinute(int m) {
        if (m < 0 || m > 59) return;
        minute = m;
    }

    public void setSecond(float s) {
        if (s < 0.0f || s > 59.99f) return;
        second = s;
    }

    @Override
    public String toString() {
        return String.format("시간: %02d시 %02d분 %.2f초", hour, minute, second);
    }
}
