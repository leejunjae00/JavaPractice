package array;

public class Array1Ref2 {
  public static void main(String[] args) {

    int[] students; //배열 변수 선언
    students = new int[5];

    //변수 값 대입
    students[0] = 90;
    students[1] = 80;
    students[2] = 70;
    students[3] = 60;
    students[4] = 50;

    //배열의 초기값은 0, i 는 0부터 시작
    for(int i = 0; i < students.length; i++){  // 배열의 길이까지
      System.out.println("학생 " + (i + 1) + " 점수: " + students[i]);
    }
  }
}
