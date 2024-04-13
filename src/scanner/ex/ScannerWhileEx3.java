package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    int count = 0;
    int input = 0;

    System.out.println("숫자를 입력: (-1 입력시 종료)");
  /*  while(true){
      input = scanner.nextInt();
      if(input == -1){
        break;
      }
      sum += input;
      count++;
    }
*/
    while((input = scanner.nextInt()) != -1){
      sum += input;
      count++;
    }

    double avg = (double) sum/count;
    System.out.println("입력한 숫자합: " + sum);
    System.out.println("입력한 숫자의 평균 : " + avg);
  }
}
