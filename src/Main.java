import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT")).useLocale(Locale.US);
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();

        double minFreq = 30.0;
        double maxFreq = 4000.0;
        double freq1 = in.nextDouble();

        for (int i = 1; i < n; i++) {
            double freq2 = in.nextDouble();
            String word = in.next();

            double half = (freq1 + freq2) / 2;

            if (word.equals("closer")) {
                if (freq1 < freq2) minFreq = Math.max(minFreq, half);
                if (freq1 > freq2) maxFreq = Math.min(maxFreq, half);
            } else {
                if (freq1 < freq2) maxFreq = Math.min(maxFreq, half);
                if (freq1 > freq2) minFreq = Math.max(minFreq, half);
            }
            freq1 = freq2;
        }

        out.printf(Locale.US, "%.7f %.7f%n", minFreq, maxFreq);
        out.close();
    }
}