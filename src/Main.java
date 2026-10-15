import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int aN = in.nextInt();
        int aNPlus1 = in.nextInt();

        for (int i = n; i > 1; i--) {
            int aNMinus1 = aNPlus1 - aN;
            aNPlus1 = aN;
            aN = aNMinus1;
        }

        out.println(aN + " " + aNPlus1);
        out.close();
    }
}