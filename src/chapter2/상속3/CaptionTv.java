package chapter2.상속3;

public class CaptionTv extends Tv{

  boolean caption;

  void displayCaption(String text) {
    if (caption) {
      System.out.println(text);
    }
  }
}
