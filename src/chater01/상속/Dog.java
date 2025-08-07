package chater01.상속;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("멍멍");
    }

    @Override
    public String getName() {
        return "강아지";
    }
}
