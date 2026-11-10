import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = a[i];
        }

        for (int d = 1; d <= n - 1; d++) {
            for (int i = d; i < n; i++) {
                int j = i - d;

                int movesMade = (n - 1) - d;
                boolean isFirstPlayerMoves = (movesMade % 2 == 0);

                int up = dp[i - 1][j];
                int right = dp[i][j + 1];

                if (isFirstPlayerMoves) {
                    dp[i][j] = Math.max(up, right);
                } else {
                    dp[i][j] = Math.min(up, right);
                }
            }
        }

        out.println(dp[n - 1][0]);

        in.close();
        out.close();
    }
}