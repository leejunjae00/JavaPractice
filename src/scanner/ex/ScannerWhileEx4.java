package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int totalCost = 0;

    while(true){
      System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
      int option = input.nextInt();

      if(option == 1){
        input.nextLine(); // 이전에 입력된 개행 문자 제거 int

        System.out.println("상품명을 입력: ");
        String product = input.nextLine();

        System.out.println("상품의 가격 입력: ");
        int price = input.nextInt();

        System.out.println("구매 수량을 입력: ");
        int quantity = input.nextInt();

        totalCost += price * quantity;
        System.out.println("상품명 : " + product + " 가격 : " + price + " 구매 수량 : " + quantity +
            "합계 : " + price * quantity);

      } else if(option == 2){
        System.out.println("총 비용: " + totalCost);
        totalCost = 0; // 결제 후 총 비용 초기화
      } else if(option == 3){
        input.nextLine();
        System.out.println("프로그램 종료");
      } else{

        System.out.println("올바른 옵션 선택");
      }
    }
  }
}
