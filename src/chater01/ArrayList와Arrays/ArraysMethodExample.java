package chater01.ArrayList와Arrays;

import java.util.Arrays;

public class ArraysMethodExample {
    public static void main(String[] args) {
        // 1. toString() - 배열 내용을 보기 쉽게 문자열로 변환
        int[] numbers = {5, 3, 9, 1};
        System.out.println(numbers); //  이건 우리가 해석 못함
        System.out.println("1. toString: " + Arrays.toString(numbers));
        // 출력: [5, 3, 9, 1]

        // 2. sort() - 배열 정렬 (기본: 오름차순)
        Arrays.sort(numbers); // numbers 배열 자체를 정렬
        Arrays.sort(numbers); // numbers 배열 자체를 정렬
        System.out.println("2. sort 후: " + Arrays.toString(numbers));
        // 출력: [1, 3, 5, 9]

        // 3. copyOf() - 배열 복사 (길이 지정 가능)
        int[] copied = Arrays.copyOf(numbers, 6); // 복사하고 남는 자리는 0으로 채움
        System.out.println("3. copyOf: " + Arrays.toString(copied));
        // 출력: [1, 3, 5, 9, 0, 0]

        // 4. equals() - 두 배열이 같은지 비교
        int[] numbers2 = {1, 3, 5, 9};
        boolean isEqual = Arrays.equals(numbers, numbers2);
        int[] numbers3 = {1, 9, 7, 9};
        boolean isNotEqual = Arrays.equals(numbers, numbers3);
        System.out.println("4. equals: " + isEqual); // true
        System.out.println("4. equals: " + isNotEqual); // false
        /*================================ 여기서 부터 number 안씀 ==============================================*/
        // 5. fill() - 배열을 특정 값으로 모두 채움
        int[] emptyArr = new int[5];
        Arrays.fill(emptyArr, 7); // 모든 값을 7로 채움
        System.out.println("5. fill: " + Arrays.toString(emptyArr));
        // 출력: [7, 7, 7, 7, 7]

        // 6. asList() - 배열을 리스트로 변환 (주의: 크기 고정 리스트)
        String[] names = {"홍길동", "김영희", "이철수"};
        System.out.println("6. asList: " + Arrays.asList(names));
        // 출력: [홍길동, 김영희, 이철수]
    }
}


