package chater01.ArrayList와Arrays;


public class TvArrayExample {
    public static void main(String[] args) {
        // 객체 배열 선언 (크기 3)
        Tv[] t = new Tv[3]; // [null, null, null]

        // 객체 생성 후 각 인덱스에 저장
        t[0] = new Tv("TV1");
        t[1] = new Tv("TV2");
        t[2] = new Tv("TV3");

        // 1번 인덱스 객체 교체
        t[1] = new Tv("바꾼 TV2");

        // 전체 출력
        for (int i = 0; i < t.length; i++) {
            System.out.print(i + "번 인덱스 → ");
            t[i].showInfo();
        }
    }
}

        // 잘못된 인덱스 접근 예시 (실행하면 오류)
        // t[3] = new Tv("TV4"); // ❌ ArrayIndexOutOfBoundsException
