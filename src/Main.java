import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        if (n == 1) out.println(1);
        else {
            int sqrt = (int) Math.sqrt(1.0 * n) + 1;
            long sum = 0L;

            for (int i = 1; i < sqrt; i++) {
                if (n % i == 0) {
                    sum += i;
                    if (i * i != n) sum += (n / i);
                }
            }

            out.println(sum);
        }
        out.close();
    }
}