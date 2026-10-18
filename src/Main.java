import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int k = in.nextInt();
        int w = in.nextInt();

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        String ans = "NO";
        if ((a1 + a2 + a3 <= w && b1 + b2 + b3 >= k) ||
                (a1 + a2 <= w && b1 + b2 >= k) ||
                (a1 + a3 <= w && b1 + b3 >= k) ||
                (a2 + a3 <= w && b2 + b3 >= k) ||
                (a1 <= w && b1 >= k) ||
                (a2 <= w && b2 >= k) ||
                (a3 <= w && b3 >= k)) {
            ans = "YES";
        }

        out.println(ans);
        out.close();
    }
}