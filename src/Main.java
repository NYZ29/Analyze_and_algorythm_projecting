import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        long[][] dp = new long[n][m];
        dp[n - 1][m - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            int k = matrix[i][m - 1];

            if (k > 0 && i + k < n) {
                dp[i][m - 1] = dp[i + k][m - 1];
            }
        }

        for (int j = m - 2; j >= 0; j--) {
            int k = matrix[n - 1][j];

            if (k > 0 && j + k < m) {
                dp[n - 1][j] = dp[n - 1][j + k];
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                int k = matrix[i][j];
                long ways = 0;

                if (k > 0 && i + k < n) {
                    ways += dp[i + k][j];
                }

                if (k > 0 && j + k < m) {
                    ways += dp[i][j + k];
                }

                dp[i][j] = ways;
            }
        }

        out.println(dp[0][0]);

        in.close();
        out.close();
    }
}