package chater01.메서드실행흐름;

import lombok.ToString;

@ToString
public class MyMath {
    double add (double a, double b) {
        return a + b;
    }

    long subtract(int a, int b) {
        return a - b;
    }
    long multiply(int a, int b) {
        return a * b;
    }
    long divide(int a, int b) {
        return a / b;
    }
}
