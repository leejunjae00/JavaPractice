package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("하나의 정수 입력:");
    int number = scanner.nextInt();

    if(number % 2 == 0){
      System.out.println("입력한 숫자 : " + number + " 짝수 ");
    } else{
      System.out.println("입력한 숫자 : " + number + " 홀수 ");
    }
  }
}
