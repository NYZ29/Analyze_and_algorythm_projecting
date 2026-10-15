import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();

        out.println(Math.min(Math.abs(i - j) - 1, n - Math.abs(i - j) - 1));
        out.close();
    }
}