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
        int k = in.nextInt();

        int ans = 0;
        if (k > 2) {
            int busCount = n / (k - 2);

            if (busCount * 2 == m && n % (k - 2) == 0) ans = busCount;
            else if (busCount * 2 < m) {
                m -= 2 * busCount;
                n %= (k - 2);

                if (n == 0 || m >= 2) {
                    busCount++;
                    m -= (k - n);

                    if (m > 0) busCount += (int)Math.ceil(1.0 * m / k);
                    ans = busCount;
                }
            }
        }

        out.println(ans);
        out.close();
    }
}