package loop;

public class Break3 {
  public static void main(String[] args) {
    int sum = 0;

    int z = 10;

    for (int i =1; ;i++){  // for 문에서만 i를 사용이 가능하다.
      sum = sum + i;
      if (sum > 10){
        System.out.println("합이 10보다 크면 끝 " + " i = " + i + " sum = " + sum);
        break;
      }

    }
  }
}
