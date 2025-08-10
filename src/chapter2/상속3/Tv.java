package chapter2.상속3;

public class Tv {

  boolean power; // 전원
  int channel;

  void power() {
    power = !power; // 전원 on/ off
  }
  void channelUp() {
    channel++;
  }
  void channelDown() {
    channel--;
  }
}
