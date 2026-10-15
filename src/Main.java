import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        long a = in.nextLong();
        long b = in.nextLong();
        double squareSide = Math.sqrt(a * b);

        out.println((squareSide == (int)squareSide) ? (int)squareSide : 0);
        out.close();
    }
}