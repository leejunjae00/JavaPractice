package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
  public static void main(String[] args) {
    int maxProducts = 10;
    String[] Names = new String[maxProducts];
    int[] Prices = new int[maxProducts];
    int Count = 0;

    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택 : ");
      int menu = sc.nextInt();
      sc.nextLine();

      if(menu == 1){
        if(Count >= maxProducts){
          System.out.println("더 이상 등록 불가");
          continue;
        }
        System.out.print("상품 이름을 입력: ");
        Names[Count] = sc.nextLine(); // 상품 이름을 0번째에 넣어줌

        System.out.print("상품 가격을 입력: ");
        Prices[Count] = sc.nextInt(); // 상품 가격을 0번째에 넣어줌

        Count++;  // 다음 상품 번호 인덱스값 1 증가
      } else if (menu == 2) {
        if(Count == 0){
          System.out.println("등록된 상품 없음");
          continue;
        }
        for(int i = 0; i < Count; i++){
          System.out.println(Names[i] + " : " + Prices[i] + "원");
        }
      } else if ( menu == 3) {
        System.out.println("프로그램 종료");
        break;
      }else{
        System.out.println("잘못 선택");
      }
    }
  }
}
