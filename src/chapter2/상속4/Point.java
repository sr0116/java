package chapter2.상속4;

public class Point {
  int x, y;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  Point() {
    this(0, 0);
  }
  String getXY() {
    return "("+ x+ "," +y+")";
  } // x와 y 값을 문자열로 반환


}
