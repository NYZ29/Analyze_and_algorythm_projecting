import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;

        while (in.hasNext()) {
            minOdd = Math.min(minOdd, in.nextInt());
            if (in.hasNext()) maxEven = Math.max(maxEven, in.nextInt());
        }

        out.println(maxEven + minOdd);
        out.close();
    }
}