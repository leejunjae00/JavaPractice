package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] numbers = new int[5];

    System.out.println("정수 입력 : ");

    for(int i = 0; i < numbers.length; i++){
      numbers[i] = sc.nextInt();
    }
    System.out.println("출력");

    for(int i = 4; i >= 0; i--){
      System.out.print(numbers[i]);
      if(i > 0){
        System.out.print(", ");
      }
    }
  }
}
