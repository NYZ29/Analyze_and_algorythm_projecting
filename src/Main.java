import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int m = in.nextInt();
        StringBuilder answer = new StringBuilder();

        if (n == 0 && m == 0) answer.append("0 0");
        else if (n == 0) answer.append("Impossible");
        else if (m == 0) answer.append(Integer.toString(n)).append(" ").append(Integer.toString(n));
        else answer.append(Math.max(m, n)).append(" ").append(m + n - 1);

        out.println(answer);
        out.close();
    }
}