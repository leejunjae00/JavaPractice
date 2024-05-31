package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("입력 할 숫자 개수 입력:");

    int count = sc.nextInt();

    int[] nums = new int[count];

    int sum = 0;
    double avg;

    System.out.println(count + "개의 정수를 입력: ");
    for(int i = 0; i < count; i++){
      nums[i] = sc.nextInt();
      sum += nums[i];
    }

    avg = (double) sum / count;
    System.out.println("입력한 정수의 합계: " + sum);
    System.out.println("입력한 정수의 평균: " + avg);

  }
}
