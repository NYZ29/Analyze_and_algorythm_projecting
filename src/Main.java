import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int m = in.nextInt();
        int n = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();
        int c = in.nextInt();

        String answer = "equal";

        if (m % 2 != 0 && n % 2 != 0) {
            if ((i + j) % 2 == 0) answer = (c == 0) ? "black" : "white";
            else answer = answer = (c == 1) ? "black" : "white";
        }

        out.println(answer);
        out.close();
    }
}