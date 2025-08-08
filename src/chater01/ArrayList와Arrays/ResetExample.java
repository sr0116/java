package chater01.ArrayList와Arrays;

import java.util.ArrayList;
import java.util.List;

public class ResetExample {
    public static void main(String[] args) {
        // ✅ 1. 배열 초기화
        Animal[] animals = new Animal[2];
        animals[0] = new Animal();
        animals[0].name = "강아지";
        animals[0].age = 2;

        // ✅ 2. 리스트 초기화
        List<Animal> animalList = new ArrayList<>();
        Animal cat = new Animal();
        cat.name = "고양이";
        cat.age = 3;
        animalList.add(cat);

        // ✅ 3. 출력
        System.out.println("배열 동물: " + animals[0].name + " (" + animals[0].age + "살)");
        System.out.println("리스트 동물: " + animalList.get(0).name + " (" + animalList.get(0).age + "살)");
    }
}

