import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT")).useLocale(Locale.US);
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        double x = in.nextDouble();
        double sum = 0.0;
        int k = 2;

        while (x > sum) {
            sum += 1.0 / k;
            k++;
        }

        out.println(k - 2 + " card(s)");
        out.close();
    }
}