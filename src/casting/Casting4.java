package casting;

public class Casting4 {
  public static void main(String[] args) {
    int div1 = 3/2;
    System.out.println(div1); //1

    double div2 = 3 / 2; // int/int 이므로 int 타입으로 결과 발생, int 값을 double에 대입 -> 자동 형 변환
    System.out.println(div2);//1.0

    double div3 = 3.0/2;  // double/int 이므로 double/double 로 형 변환 발생
    System.out.println(div3);//1.5

    double div4 = (double) 3/2;
    System.out.println(div4);//1.5

    int a = 3;
    int b = 2;
    double result = (double) a/b;
    System.out.println(result); //1.5

  }
}
