import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        long c = in.nextLong();
        long h = in.nextLong();
        long o = in.nextLong();

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(Math.min(Math.min(c / 2, h / 6), o));
        out.close();
    }
}