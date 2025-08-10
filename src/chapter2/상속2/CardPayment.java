package chapter2.상속2;

class CardPayment extends Payment {
  public CardPayment(double amount) {
    super(amount);
  }

  @Override
  public void approve() {
    super.approve(); // 부모의 approve() 먼저 실행
    System.out.println("신용카드 결제 승인: 카드사 연결 중...");
  }
}

class BankTransfer extends Payment {
  public BankTransfer(double amount) {
    super(amount);
  }

  @Override
  public void approve() {
    super.approve(); // 부모의 approve() 먼저 실행
    System.out.println("계좌 이체 결제 승인: 은행 계좌 확인 중...");
  }
}

class EasyPay extends Payment {
  public EasyPay(double amount) {
    super(amount);
  }

  @Override
  public void approve() {
    super.approve(); // 부모의 approve() 먼저 실행
    System.out.println("간편결제 승인: 토큰 인증 중...");
  }
}
