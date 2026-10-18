import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        long sum = 0L;
        long plus = 3L;

        for (int i = 0; i < n; i++) {
            if (in.nextInt() == 1){
                sum += plus;
                plus++;
            }
            else plus = Math.max(plus - 3, 3);
        }

        out.println(sum);
        out.close();
    }
}