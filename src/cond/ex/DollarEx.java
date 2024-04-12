package cond.ex;

public class DollarEx {
  public static void main(String[] args) {

    int dollar = 50;

    if(dollar < 0){
      System.out.println("잘못된 금액");
    }else if(dollar == 0){
      System.out.println("돈이 없음");
    }else{
      int won = dollar * 1300;
      System.out.println(" 환전 금액 " + won);
    }
  }
}
