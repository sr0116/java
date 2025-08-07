package chater01.추상클래스및메서드;

public abstract class Animal {
    // 추상 메서드 (선언만 있고 구현은 없음)
    public abstract void speak();

    // 일반 메서드도 가질 수 있음
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }
}

