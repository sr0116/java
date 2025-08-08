package chater01.ArrayList와Arrays;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // 처음엔 ArrayList 사용
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("바나나");

        System.out.println("ArrayList: " + list);

        // 나중에 LinkedList로 교체
        list = new LinkedList<>();
        list.add("딸기");
        list.add("포도");

        System.out.println("LinkedList: " + list);
    }
}

