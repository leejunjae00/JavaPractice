package method.ex;

import java.util.Scanner;

public class MethodEx3Ref {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int balance = 10000;

    System.out.print("입금 :");
    balance = deposit(balance, sc.nextInt());
    System.out.print("출금 :");
    balance = withdraw(balance, sc.nextInt());
  }

  // 입금
  public static int deposit(int balance, int amount){ // 잔고, 입금할 금액
    balance += amount;
    System.out.println(amount + " 원을 입금. 현재 잔액: " + balance + "원");
    return balance;
  }

  // 출금
  public static int withdraw(int balance, int amount){
    if(balance >= amount) {
      balance -= amount;
      System.out.println(amount + " 원을 출금. 현재 잔액: " + balance + "원");
    } else{
      System.out.println(amount + " 원을 출금 불가 ( 잔액 부족 )");
    }
    return balance;
  }
}
