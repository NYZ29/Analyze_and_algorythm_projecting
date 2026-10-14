import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        long S = 2 * (a * b + b * c + a * c);
        long V = a * b * c;

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(S + " " + V);
        out.close();
    }
}