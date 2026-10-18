import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        long n = in.nextLong();
        long m = in.nextLong();
        long f = in.nextLong();
        long l = in.nextLong();

        long both = m + f - (n - l);
        long math = m - both;
        long physics = f - both;

        out.println(both + " " + math + " " + physics);
        out.close();
    }
}