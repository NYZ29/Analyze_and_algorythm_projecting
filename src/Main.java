import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int m = in.nextInt();
        int n = in.nextInt();

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(m * n - m - n + 1);
        out.close();
    }
}