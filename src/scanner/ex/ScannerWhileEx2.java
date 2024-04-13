package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while(true){
      System.out.println("상품 가격: ");
      int price = input.nextInt();

      if(price == -1){
        System.out.println("프로그램 종료");
        break;
      }
      System.out.println("구매 수량 : ");
      int quantity = input.nextInt();

      int totalCost = price * quantity;
      System.out.println("총 비용 : " + totalCost);
    }
  }
}
