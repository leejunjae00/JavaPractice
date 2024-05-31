package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("입력할 숫자 입력: ");
    int n = sc.nextInt();

    int[] nums = new int[n];

    int maxNum;
    int minNum;

    System.out.println(n + "개의 정수 입력");

    for(int i = 0; i < n; i++){
      nums[i] = sc.nextInt();
    }

    minNum = nums[0];
    maxNum = nums[0];

    for(int i = 1; i < n; i++){
      if(nums[i] < minNum){
        minNum = nums[i];
      }
      if(nums[i] > maxNum){
        maxNum = nums[i];
      }
    }
    System.out.println("가장 큰 정수 : " + maxNum);
    System.out.println("가장 작은 정수 : " + minNum);

  }
}
