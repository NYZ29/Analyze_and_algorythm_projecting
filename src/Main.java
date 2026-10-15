import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int[] countOfTeams = new int[n];

        for (int i = 0; i < n; i++) {
            countOfTeams[i] = in.nextInt();
        }
        int k = in.nextInt();

        int mxCount = 0;
        for (int i = 0; i < n; i++) {
            mxCount += Math.min(countOfTeams[i], k);
        }

        out.println(mxCount);
        out.close();
    }
}