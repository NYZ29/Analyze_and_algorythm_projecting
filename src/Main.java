import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int len = 0;
        int mxLen = 0;

        for (int i = 0; i < n; i++) {
            int t = in.nextInt();

            if (t > 0) len++;
            else len = 0;
            mxLen = Math.max(mxLen, len);
        }

        out.println(mxLen);
        out.close();
    }
}