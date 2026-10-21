import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        boolean isMin = (in.nextInt() == 1);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (isMin) {
            out.println(Math.max(0, n - (n - a) - (n - b) - (n - c)));
        } else {
            out.println(Math.min(Math.min(a, b), c));
        }

        out.close();
    }
}