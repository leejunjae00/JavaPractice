package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("첫번째 숫자: ");
    int num1 = scanner.nextInt();

    System.out.println("두번째 숫자: ");
    int num2 = scanner.nextInt();

    if(num1 > num2){
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
    System.out.println("현재 num1 값 : " + num1);
    System.out.println("현재 num2 값 : " + num2);

    System.out.println(" 두 숫자 사이의 모든 정수 : ");
    for(int i = num1; i <= num2; i++){
      System.out.print(i);
      if(i != num2){  // 다르면 실행 마지막은 같기 때문에 종료
        System.out.print(",");
      }
    }
  }
}
