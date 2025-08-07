package chater01.인스턴스객체;


import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
public class Tv {
    String brand;
    boolean power;
    int channel;

    void powerToggle() {
        // 전원 상태를 반전시킴 (켜져 있으면 끄고, 꺼져 있으면 켬)
        power = !power;
    }

    void channelUp() {
        // 채널을 1 증가시킴
        channel++;
    }

    void showInfo() {
        // TV의 브랜드 이름 출력
        System.out.println("브랜드: " + brand);

        // 전원 상태 출력 (power가 true이면 "ON", false이면 "OFF")
        System.out.println("전원: " + (power ? "ON" : "OFF"));

        // 현재 채널 번호 출력
        System.out.println("채널: " + channel);
    }
}