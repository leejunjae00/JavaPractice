package casting;

public class Casting2 {
  public static void main(String[] args) {
    double doubleValue = 1.5;
    int intValue = 0;

    //intValue = doubleValue; // 컴파일 오류
    intValue = (int) doubleValue; // double을 int형으로 형 변환
    System.out.println(intValue); // doubleValue 의 값이 변경 되는 것은 아님

  }
}
