package chater01.클래스변수와인스턴스변수차이;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class Card {

    // 인스턴스 변수

    String kind;
    int number;

    //클래스 변수 (고정 값 주기)
    static int width = 100; //폭
    static int height = 250; // 높이

    // static은 @ToString 어노테이션에서 사용 불가(인스턴스 변수만 가능)
    // 직접 오버라이드 해줘야함
    @Override
    public String toString() {
        // 인스턴스 필드 + static 필드 전부 포함
        return "Card{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}