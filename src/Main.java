import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        long[] dp = new long[n];
        dp[0] = 3L;

        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] * 2;
        }

        out.println(dp[n - 1]);

        in.close();
        out.close();
    }
}