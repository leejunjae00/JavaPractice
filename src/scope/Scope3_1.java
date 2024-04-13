package scope;

public class Scope3_1 {
  public static void main(String[] args) {

      int m = 10;
      int temp = 0;  // temp 는 if 코드 블록에서만 필요 불필요
      if(m>0){  // if 코드 안에 temp를 선언하면 if 문 이후 temp 생각하지 않아도 된다.
        temp = m * 2;
        System.out.println("temp = " + temp);
      }
    System.out.println("m = " + m);
  }
}
