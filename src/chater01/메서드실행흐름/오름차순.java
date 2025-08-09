package chater01.메서드실행흐름;

public class 오름차순 {
  public static void main(String[] args) {
    // 초기 배열
    int[] arr = {2, 4, 5, 8, 1, 6};

    // 버블 정렬 (오름차순)
    for (int i = 0; i < arr.length - 1; i++) {
      // 바깥 for: 전체 반복 횟수 (n-1번)
      for (int j = 0; j < arr.length - 1 - i; j++) {
        // 안쪽 for: 인접한 값 비교
        if (arr[j] > arr[j + 1]) {
          // 조건: 앞의 값이 뒤의 값보다 크면 교환(스왑)
          int temp = arr[j];   // 임시 변수에 저장
          arr[j] = arr[j + 1]; // 뒤 값을 앞으로
          arr[j + 1] = temp;   // 임시 값 뒤로
        }
      }
    }

    // 정렬된 결과 출력
    for (int num : arr) {
      System.out.print(num + " ");

    }
  }
}
