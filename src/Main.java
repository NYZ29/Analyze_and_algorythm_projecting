import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        int maxWhite = 0;

        for (int i = 1; i <= m; i++) {
            maxWhite = Math.max(maxWhite, i % k);
        }

        out.println((m / k + maxWhite) * n);
        out.close();
    }
}