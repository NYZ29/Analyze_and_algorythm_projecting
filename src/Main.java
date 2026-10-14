import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();

        String answer = (a1 + a2 == a3 || a1 + a3 == a2 || a2 + a3 == a1) ? "YES" : "NO";

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(answer);
        out.close();
    }
}