package chapter02.listInterface;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {  public static void main(String[] args) {
  // ArrayList로 List 생성
  List<String> list = new ArrayList<>();

  // add()
  list.add("Java");
  list.add("Python");
  list.add(1, "C++"); // 인덱스 1에 삽입
  System.out.println("After add: " + list); // [Java, C++, Python]

  // get()
  System.out.println("Index 1: " + list.get(1)); // C++

  // set()
  list.set(1, "JavaScript");
  System.out.println("After set: " + list); // [Java, JavaScript, Python]

  // contains()
  System.out.println("Contains Python? " + list.contains("Python")); // true

  // indexOf() / lastIndexOf()
  list.add("Java");
  System.out.println("First Java: " + list.indexOf("Java"));  // 0
  System.out.println("Last Java: " + list.lastIndexOf("Java")); // 3

  // remove()
  list.remove(2); // 인덱스 2 삭제 (Python)
  list.remove("Java"); // 첫 번째 Java 삭제
  System.out.println("After remove: " + list);

  // size() / isEmpty()
  System.out.println("Size: " + list.size()); // 요소 개수
  System.out.println("Is empty? " + list.isEmpty()); // false

  // subList()
  list.add("Kotlin");
  list.add("Swift");
  System.out.println("SubList(0, 2): " + list.subList(0, 2));

  // clear()
  list.clear();
  System.out.println("After clear: " + list); // []
}
}