package array;

public class EnhancedFor1 {
  public static void main(String[] args) {

    int[] numbers = {1,2,3,4,5};

    //일반 for문
    for(int i = 0; i < numbers.length; i++){
      int number = numbers[i];
      System.out.println(number);
    }
    System.out.println();

    //향상된 for문, for-each문
    for(int number : numbers){    // 배열을 전부 순회하여 인덱스 값 순서대로 배열의 값을 넣어준다.
      System.out.println(number); // 처음부터 끝까지 탐색함. 인덱스 번호가 직접적으로 필요한 경우 X
    }

  }
}
