package method;

public class MethodValue0 {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = num1;  // num1 에 들어있는 값을 읽고 복사해서 num2에 넣는 것
    num2 = 10;

    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
  }
}
