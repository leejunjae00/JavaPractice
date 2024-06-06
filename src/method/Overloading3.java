package method;

public class Overloading3 {
  public static void main(String[] args) {
    System.out.println("1: " + add(1,2));
    System.out.println("2: " + add(1.2,1.5));
  }

  // 두 개의 메서드가 이름은 같지만, 매개 변수의 유형이 다름

  public static int add(int a, int b){
    System.out.println("1번 호출");
    return a + b;
  }
  public static double add(double a, double b){
    System.out.println("2번 호출");
    return a + b;
  }
}
