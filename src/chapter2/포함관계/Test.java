package chapter2.포함관계;

public class Test {
  public static void main(String[] args) {
    Point c = new Point();// 이렇게 생성하지 않아도 이미 c1에서 가져와서 사용 가능
    Circle c1 = new Circle();
    c1.c.x = 100; //
    c1.c.x = 100;

    c1.r = 50;
    System.out.printf("원의 중심: (%d, %d), 반지름: %d\n",
            c1.c.x, c1.c.y, c1.r);

  }
}
