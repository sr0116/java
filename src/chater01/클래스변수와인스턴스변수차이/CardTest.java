package chater01.클래스변수와인스턴스변수차이;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CardTest {
    public static void main(String[] args) {
       log.info("{} 카드 폭", Card.width);
       log.info("{} 카드 높이", Card.height);

       Card.width = 300; // 위에서 이렇게 변동하는걸 추천 (인스턴스 변수랑 안 헷갈림)
       Card.height = 400;

       Card card = new Card();
       card.kind = "하트";
       card.number = 9;

        Card card2 = new Card();
        card2.kind = "스페이드";
        card2.number = 5;

        Card card3 = new Card();
        card3.kind = "클로버";
        card3.number = 3;
      //card.width = 150; // 직접 변경 가능 (어떤걸로 변경하든 클래스 변수라서 같이 변동됨)
       //card.height = 200; //1,2,3 모두 같은 값으로 변동

       // Override 직접 해줘서 전부 볼 수 있고 아니면 폭 , 넓이 안보임
       log.info("{} {} {} 카드 속성", card, card2 , card3);
    }
}
