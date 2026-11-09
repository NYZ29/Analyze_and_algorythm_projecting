import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();

        int d1 = n / 100_000;
        int d2 = (n / 10_000) % 10;
        int d3 = (n / 1_000) % 10;
        int d4 = (n / 100) % 10;
        int d5 = (n / 10) % 10;
        int d6 = n % 10;

        if (d1 + d2 + d3 == d4 + d5 + d6) out.println("YES");
        else out.println("NO");

        out.close();
    }
}