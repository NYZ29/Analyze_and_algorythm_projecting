import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        double S = 0;
        int h1 = in.nextInt();

        for (int i = 1; i < n; i++) {
            int h2 = in.nextInt();
            S += (h1 + h2) / 2.0;
            h1 = h2;
        }

        out.printf(Locale.US, "%.6f", S / (n - 1));
        out.close();
    }
}