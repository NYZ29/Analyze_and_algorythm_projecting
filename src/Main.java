import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        String E = "2.7182818284590452353602875";
        int n = in.nextInt();

        StringBuilder ans = new StringBuilder();

        if (n == 0) ans.append(3);
        else {
            ans.append(E.substring(0, n + 1));
            if (E.length() > n + 2 && E.charAt(n + 2) >= '5') ans.append(E.charAt(n + 1) - '0' + 1);
            else ans.append(E.charAt(n + 1));
        }

        out.println(ans);
        out.close();
    }
}