package chater01.상속;

public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("야옹");
    }

    @Override
    public String getName() {
        return "고양이";
    }
}
