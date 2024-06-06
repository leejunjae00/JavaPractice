package method;

public class Method1Ref {
  public static void main(String[] args) {
    //계산1
    int sum1 = add(5, 10); // 1. add 함수 호출
    // 4. add 함수 수행 후 15로 바뀌게 된다.
    System.out.println("결과1 출력: " + sum1);

    //계산2
    int sum2 = add(15, 20);
    System.out.println("결과2 출력:" + sum2);
  }

  public static int add(int a, int b){ // 2. (5, 10) 값이 전달 수행
    System.out.println(a + " + " + b + "연산 수행"); // 3. (5 + 10) 출력됌
    int sum = a + b;
    return sum; // 정수형 15 반환
  }

}
