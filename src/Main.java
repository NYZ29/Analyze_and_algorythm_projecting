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
       int v = in.nextInt();
       int l = in.nextInt();

       int dopTime = 0;

       for (int i = 0; i < n; i++) {
           if (in.nextInt() <= l) dopTime += in.nextInt();
       }

       double allTime = 60.00 * l / v + dopTime;

       out.printf(Locale.US, "%.2f%n", allTime);
       out.close();
    }
}