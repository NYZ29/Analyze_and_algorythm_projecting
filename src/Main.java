import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int s = in.nextInt();
        int t = in.nextInt();

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println((t + 12 - s) % 12);
        out.close();
    }
}