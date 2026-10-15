import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int t = in.nextInt();

        int answer = (t <= a) ? t * b : a * b + (t - a) * c;

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(answer);
        out.close();
    }
}