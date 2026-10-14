import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int n = in.nextInt();
        String answer = "0";
        if (n > 1) answer = (n % 2 == 0) ? Integer.toString(n / 2) : Integer.toString(n);

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(answer);
        out.close();
    }
}