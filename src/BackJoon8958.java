import java.util.Scanner;

public class BackJoon8958 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());

    for(int i = 1; i <= n; i++) {
      String rs = sc.nextLine();
      int score = 0;
      int initNum = 0;

      for(int j = 0; j < rs.length(); j++) {
        if(rs.charAt(j) == 'O') {
          initNum++;
          score += initNum;
        }
        else {
          initNum = 0;
        }
      }

      System.out.println(score);
    }

    sc.close();
  }
}
