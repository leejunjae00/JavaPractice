package scope;

public class Scope3_2 {
  public static void main(String[] args) {

      int m = 10;

      if(m>0){    // temp를 if문 안에 선언하여 메모리를 효율적으로 사용 가능
       int temp = m * 2;
        System.out.println("temp = " + temp);
      }
    System.out.println("m = " + m);
  }
}
