package chater01.ArrayList와Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList<> (); // 제네릭 타입으로 만든거고 String 타입
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("딸기");
        fruits.add("블루베리"); // 계속 인덱스 추가 가능

        // 출력
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(i + "번 인덱스: " + fruits.get(i));
        }
    }
}


