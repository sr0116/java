package chapter2.상속4;

public class DrawShape {
  public static void main(String[] args) {
    Point p[] = {
            new Point(100, 100),
            new Point(200, 200),
            new Point( 300, 300)
    }; //배열로 새 인스터느 생성

    Triangle t=  new Triangle(p);// 삼각형
    Circle c = new Circle(new Point(400, 400), 200); // 원
    Circle c1 = new Circle(p[1], 200); // 원

    t.draw();
    c.draw();
    c1.draw();
  }
}
