import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BackJoon8958 {
  public static void main(String[] args)  {
    // exam1();
    exam2();
  }

  private static void exam2() {
    System.out.println("== 최적화 된 방식 ==");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    try {
      // 테스트 케이스 개수 받기
      int n = Integer.parseInt(br.readLine());

      // readLine() : 입력
      // toCharArray() : 입력받은 문자열을 문자 배열로 변경
      while (n-- > 0) {
        // OXO
        char[] rs = br.readLine().toCharArray(); // ['O', 'X', 'O'...]
        int score = 0;
        int initNum = 0;

        for(char c : rs) {
          if(c == 'O') {
            score += ++initNum;
            // score = score + (++initNum)
          } else {
            initNum = 0;
          }
        }

        sb.append(score).append('\n');
      }

      System.out.println(sb);
      br.close();

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static void exam1() {
    System.out.println("== 일반적인 방식 ==");
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
