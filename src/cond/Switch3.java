package cond;

public class Switch3 {
  public static void main(String[] args) {
    int grade = 2;

    int coupon;
    switch (grade){
      case 1:
        coupon = 1000;
        break;
      case 2:  // case 2에 break 문이 없어 다음에 있는 case 3 의 코드를 실행함
      case 3:
        coupon = 3000;
        break;
      default:
        coupon = 500;
    }
    System.out.println(coupon);
  }
}
