import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int[] homes = new int[n];
        for (int i = 0; i < n; i++) {
            homes[i] = in.nextInt();
        }

        out.println(homes[n / 2]);
        out.close();
    }
}