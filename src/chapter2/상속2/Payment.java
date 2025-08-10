package chapter2.상속2;

public class Payment { protected double amount; // 결제 금액

  public Payment(double amount) {
    this.amount = amount;
  }

  // 공통 메서드
  public void validateAmount() {
    if (amount <= 0) {
      throw new IllegalArgumentException("결제 금액은 0보다 커야 합니다.");
    }
    System.out.println("결제 금액 검증 완료: " + amount + "원");
  }

  // 각 결제 방식에서 다르게 구현할 메서드
  public void approve() {
    System.out.println("기본 결제 승인 로직");
  }

  // 결제 프로세스 (템플릿 메서드)
  public final void process() {
    validateAmount(); // 금액 검증 (공통)
    approve();        // 승인 (개별 구현)
    System.out.println("결제 완료!\n");
  }
}
