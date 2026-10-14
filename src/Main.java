import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int b3 = in.nextInt();

        int mnA = Math.min(Math.min(a1, a2), a3);
        int mxA = Math.max(Math.max(a1, a2), a3);
        int avgA = a1 + a2 + a3 - mnA - mxA;

        int mnB = Math.min(Math.min(b1, b2), b3);
        int mxB = Math.max(Math.max(b1, b2), b3);
        int avgB = b1 + b2 + b3 - mnB - mxB;

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(mxA * mxB + avgA * avgB + mnA * mnB);
        out.close();
    }
}