package operator;

public class OperatorAd1 {
  public static void main(String[] args) {
    int a = 0;

    a = a + 1; // 자기자신에 1을 더하고 그 결과를 자신에게 다시 저장
    System.out.println(a);

    a = a +1;
    System.out.println(a);

    // 증감 연산자
    ++a; // a = a+1;
    System.out.println(a);
    ++a; // a = a+1;
    System.out.println(a);
  }
}
