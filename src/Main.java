import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int m3 = in.nextInt();

        String answer = "Error";
        if (m1 >= 94 && m1 <= 727 && m2 >= 94 && m2 <= 727 && m3 >= 94 && m3 <= 727) {
            int mx = Math.max(Math.max(m1, m2), m3);
            answer = Integer.toString(mx);
        }

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(answer);
        out.close();
    }
}