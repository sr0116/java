package chapter2.상속3;

public class TvTest {
  public static void main(String[] args) {
    CaptionTv ctv = new CaptionTv();
    ctv.channel = 8;
    System.out.println("Tv 채널 번호 : " + ctv.channel);
    ctv.channelUp();// 9로 변경됨
    System.out.println("Tv 채널 번호 : " + ctv.channel);
    ctv.channelDown(); // 다시 8
    ctv.displayCaption("Tv 자막 넣기");
    System.out.println(ctv.caption); // 기본 값 false라 안 보임
    ctv.caption = true;
    ctv.displayCaption("Tv 자막 넣기");
  }
}
