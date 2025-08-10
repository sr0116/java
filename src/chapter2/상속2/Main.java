package chapter2.상속2;

public class Main {
  public static void main(String[] args) {

    Payment p1 = new CardPayment(1000);
    Payment p2 = new BankTransfer(80000);
    Payment p3 = new EasyPay(15000);

    // 다형성: 부모 타입으로 동일한 메서드 호출 가능
    p1.process();
    p2.process();
    p3.process();
  }
}

