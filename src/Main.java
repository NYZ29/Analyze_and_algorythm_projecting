import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }

        int k = in.nextInt();
        int[] counts = new int[n];

        for (int i = 0; i < k; i++) {
            counts[in.nextInt() - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (c[i] < counts[i]) out.println("yes");
            else out.println("no");
        }

        out.close();
    }
}