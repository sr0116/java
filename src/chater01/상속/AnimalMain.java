package chater01.상속;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() }; // 배열 생성

        for (Animal a : animals) { // 향상 for문
            System.out.println(a.getName() + "가 소리를 냅니다:");
            a.speak();
            System.out.println(); // 줄바꿈
        }
    }
}
