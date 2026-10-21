import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int count = 0;

        while (n > 0) {
            count += (n % 2);
            n /= 2;
        }

        out.println(count);
        out.close();
    }
}