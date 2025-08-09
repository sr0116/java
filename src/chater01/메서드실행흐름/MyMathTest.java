package chater01.메서드실행흐름;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath num = new MyMath();
         double add = num.add(1L, 2L);
//          num.add(7, 2);
        System.out.println("더하기 : " + add);
//        System.out.println("더하기 : " +  num.add(7, 2));

        long minus = num.subtract(8, 3);
        System.out.println("빼기 : " + minus);

        long mul = num.multiply(-1, 2);
        System.out.println("곱하기 : " + mul);

        long di = num.divide(6, 2);
        System.out.println("나누기 : " + di);

    }

}
