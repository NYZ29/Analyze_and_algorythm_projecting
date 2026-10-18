import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int sum = in.nextInt();
        int k = 0;

        while (sum > 0) {
            k++;
            sum -= k;
        }

        out.println(k);
        out.close();
    }
}