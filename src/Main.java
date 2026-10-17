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
        int mnCount = Integer.MAX_VALUE;
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            int first = line.indexOf('.');
            int last = line.lastIndexOf('.');

            int count = (int)line.chars().filter(c -> c == '.').count();

            mnCount = Math.min(mnCount, count);
        }

        out.println(mnCount);
        out.close();
    }
}