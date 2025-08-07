package chater01.인스턴스객체;

public class TvMain {
    public static void main(String[] args) {
//        Tv myTV = new Tv();   // 객체 생성  이미 세가지 속성 존재- 이 순간 자동 초기화되면서 자동으로 기본 값이 할당 됨 ( 클래스를 만들고 그걸 불러와서 객체 생성)
        Tv myTV = new Tv("LG", true, 6); //  생성자 값을 먼저 지정해주고 나서 메서드 사용해서 값을 지정하는 방법도 있음
        myTV.brand = "Samsung";  // 속성 설정 (클래스에서 Brand 라는 변수를 먼저 생성)
        myTV.powerToggle();  // 기능 사용  power = !power;
        myTV.channelUp(); // channel++
        myTV.showInfo();     // 결과 출력

        myTV.brand = "apple"; // 이런식으로 위에 새 인스턴스 생성한 뒤에는 그 안에서 있는 값 하나씩도 지정 가smd
        System.out.println("My TV is " + myTV.brand);
        myTV.channel = 9; // 값 지정 후
        myTV.channelUp(); // 메서드 적용하면 10
        System.out.println("Tv channel is " + myTV.channel);
    }


}