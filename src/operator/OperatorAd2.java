package operator;

public class OperatorAd2 {
  public static void main(String[] args) {
    int a = 1;
    int b = 0;

    b = ++a; // a의 값을 먼저 증가 시키고, 그 결과를 b 에 대입
    System.out.println(a + "and" + b);

    //후위 증감 연산자 예
    a = 1;
    b = 0;

    b = a++; // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가 시킴
    System.out.println(a + " and " + b);
  }
}
