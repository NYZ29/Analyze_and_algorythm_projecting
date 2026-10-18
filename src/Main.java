import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int start = 1;
        int end = 31;

        for (int i = 0; i < n; i++) {
            start = Math.max(start, in.nextInt());
            end = Math.min(end, in.nextInt());
        }

        out.println((start <= end) ? "YES" : "NO");
        out.close();
    }
}