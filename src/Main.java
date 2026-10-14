import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int w = in.nextInt();
        int h = in.nextInt();
        int r = in.nextInt();

        String answer = (w >= 2 * r && h >= 2 * r) ? "YES" : "NO";

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(answer);
        out.close();
    }
}