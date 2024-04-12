package cond.ex;

public class GradeEx {
  public static void main(String[] args) {
    String grade = "B";

    switch (grade){
      case "A":
        System.out.println("Perfect");
        break;
      case "B":
        System.out.println("Good");
        break;
      case "C":
        System.out.println("not bad");
        break;
      case "D":
        System.out.println("bad");
        break;
      case "F":
        System.out.println("very bad");
        break;
      default:
        System.out.println("잘못된 학점");
    }
  }
}
