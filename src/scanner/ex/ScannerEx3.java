package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int totalPrice = 0;

    System.out.println("음식 : ");
    String foodName = scanner.nextLine();

    System.out.println("가격 : ");
    int foodPrice = scanner.nextInt();

    System.out.println("수량 : ");
    int foodQuantity = scanner.nextInt();

    totalPrice = foodPrice * foodQuantity;

    System.out.println("피자를 " + foodQuantity + "개 주문하셨습니다. 총 가격은 " + totalPrice + "원 입니다.");


  }
}
