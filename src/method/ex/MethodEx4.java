package method.ex;

import java.util.Scanner;

public class MethodEx4 {
  public static void main(String[] args) {
    int balance = 0;
    Scanner sc = new Scanner(System.in);

    while(true){
      System.out.println("---------------------------");
      System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
      System.out.println("---------------------------");
      System.out.println("선택 : ");

      int choice = sc.nextInt();
      int amount;

      switch(choice){
        case 1:
          System.out.println("입금액 입력: ");
          balance = deposit(balance,sc.nextInt());
          break;
          case 2:
            System.out.println("출금액 입력: ");
            balance = withdraw(balance,sc.nextInt());
            case 3:
              System.out.println("현재 잔액 " + balance + "원");
              break;
              case 4:
                System.out.println("시스템 종료");
                return;
                default:
          System.out.println("올바른 선택이 아님. 다시 선택!");
      }
    }

  }
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
