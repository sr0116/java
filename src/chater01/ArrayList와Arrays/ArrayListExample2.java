package chater01.ArrayList와Arrays;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {

        // ArrayList 생성 (문자열 타입)
        ArrayList<String> fruits = new ArrayList<>();

        // 1. add(E e): 요소 추가
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("딸기"); // 하나씩만 추가 가능
        fruits.add("블루베리");
        System.out.println("1. add 후: " + fruits); // [사과, 바나나, 딸기]
        System.out.println("사이즈 4개 나와야 함 : " + fruits.size() + "개");

        // 2. get(int index): 특정 인덱스의 요소 꺼내기
        String firstFruit = fruits.get(0); // 인덱스 0
        System.out.println("2. get(0): " + firstFruit); // 사과
        System.out.println("2. get(2): " + firstFruit); // 딸기

        // 3. set(int index, E e): 특정 위치 값 변경
        fruits.set(1, "오렌지"); // 인덱스 1 → 바나나 → 오렌지
        fruits.set(3, "체리"); // 블루베리 인덱스 번호 3
        System.out.println("3. set(1, 오렌지): " + fruits); // [사과, 오렌지, 딸기]

        // 4. remove(int index): 특정 인덱스 요소 삭제
        fruits.remove(2); // 인덱스 2의 딸기 삭제
        System.out.println("4. remove(2): " + fruits); // [사과, 오렌지]

        // 5. size(): 총 요소 개수 확인
        int size = fruits.size();
        System.out.println("5. size(): " + size);

        // 6. contains(E e): 요소 포함 여부 확인
        boolean hasApple = fruits.contains("사과");
        boolean hasBanana = fruits.contains("바나나");
        System.out.println("블루베리가 배열에 있는지 " + fruits.contains("블루베리"));
        System.out.println("6. contains(\"사과\"): " + hasApple);   // true
        System.out.println("   contains(\"바나나\"): " + hasBanana); // false

        // 7. clear(): 모든 요소 삭제
        fruits.clear();
        System.out.println("7. clear() 후: " + fruits); // []
    }
}
