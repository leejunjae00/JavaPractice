package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 구구단
    System.out.println("구구단의 단수 입력: ");
    int n = scanner.nextInt();

    System.out.println(n + "단의 구구단 :");
    for(int i = 1; i < 10; i++){
      System.out.println(n + " x " + i + "=" + n * i);
    }
  }
}
