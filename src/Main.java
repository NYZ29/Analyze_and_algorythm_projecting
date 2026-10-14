import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int s = in.nextInt();
        int pAnds = s / 6;
        int k = pAnds * 4;

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(pAnds + " " + k + " " + pAnds);
        out.close();
    }
}