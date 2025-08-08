package chater01.ArrayList와Arrays;

import java.util.*;

public class ListImplementationsExample {
    public static void main(String[] args) {

        // 1. ArrayList (가장 기본적인 리스트, 조회 빠름)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("사과");
        arrayList.add("바나나");
        arrayList.add("딸기");
        System.out.println("✅ ArrayList: " + arrayList);
        System.out.println("ArrayList - get(1): " + arrayList.get(1)); // 바나나

        // 2. LinkedList (삽입/삭제에 유리, 노드 구조)
        List<String> linkedList = new LinkedList<>();
        linkedList.add("커피");
        linkedList.add("차");
        linkedList.add(1, "물"); // 중간 삽입
        System.out.println("\n✅ LinkedList: " + linkedList);
        System.out.println("LinkedList - get(1): " + linkedList.get(1)); // 물

        // 3. Vector (ArrayList와 비슷하지만 동기화 지원 - 멀티스레드에 안전)
        List<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");
        System.out.println("\n✅ Vector: " + vector);
        System.out.println("Vector - get(2): " + vector.get(2)); // Blue

        // 4. Stack (Vector 상속, LIFO 구조)
        Stack<String> stack = new Stack<>();
        stack.push("HTML");
        stack.push("CSS");
        stack.push("JavaScript");
        System.out.println("\n✅ Stack: " + stack);
        System.out.println("Stack - pop(): " + stack.pop()); // JavaScript (맨 위 요소 제거)
        System.out.println("Stack - peek(): " + stack.peek()); // CSS (제거하지 않고 확인)
        System.out.println("Stack - push(): " + stack.push( "맨 앞에 추가"));
        // 스택을 배열로 변환
        String[] arr = stack.toArray(new String[0]);

// 배열 정렬
        Arrays.sort(arr);

// 출력 확인
        System.out.println("정렬된 배열: " + Arrays.toString(arr));

        // stream 이용한 list 로 변환
        List<String> list = stack.stream().toList();
        System.out.println(list);



    }
}

