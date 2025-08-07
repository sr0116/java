package chater01.추상클래스및메서드;

public class AnimalMain {
    public static void main(String[] args) {
//         Animal animal = new Animal();  ❌ 에러! 추상 클래스는 직접 객체 생성 불가

        Animal dog = new Dog();  // ✅ 추상 클래스 타입의 참조 변수로 자식 객체 참조
        dog.speak();             // "멍멍" 출력
        dog.breathe();           // "숨을 쉽니다." 출력

        // 또는
        Dog realDog = new Dog();  // 자식 클래스 타입으로도 생성 가능
        realDog.speak();
        realDog.breathe();
    }
}