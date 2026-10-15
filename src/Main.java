import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int[] blueberries = new int[n];

        for (int i = 0; i < n; i++) {
            blueberries[i] = in.nextInt();
        }

        int sum = blueberries[0] + blueberries[1] + blueberries[2];
        int mxSum = sum;

        for (int i = 3; i < n + 3; i++) {
            sum = sum - blueberries[i - 3] + blueberries[i % n];
            mxSum = Math.max(mxSum, sum);
        }

        out.println(mxSum);
        out.close();
    }
}