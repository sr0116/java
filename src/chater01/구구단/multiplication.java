package chater01.구구단;

public class multiplication {
    public static void main(String[] args) {
        int number;
        for (int i = 1; i <= 9; i++) {
            System.out.println("==========" +i +"단 구구단===========" ); // 한 단 끝나면 줄바꿈
            for (int j = 1; j <= 9; j++) {
               number = i * j ;
//                System.out.println(number); // 보기 힘들게 출력됨
                System.out.printf("%d x %d = %d\t", i, j, i * j);
            }

            System.out.println(); // 한 단 끝나면 줄바꿈
        }
    }
}
