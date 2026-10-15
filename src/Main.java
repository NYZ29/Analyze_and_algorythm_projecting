import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int l = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println((int)Math.ceil((l + w) * h / 8.0));
        out.close();
    }
}