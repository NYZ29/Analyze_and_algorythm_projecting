import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int[] taxes = new int[n];

        int maxTax = -1;
        int numberOfMax = 0;

        for (int i = 0; i < n; i++) {
            taxes[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            taxes[i] *= in.nextInt();

            if (taxes[i] > maxTax) {
                maxTax = taxes[i];
                numberOfMax = i + 1;
            }
        }

        out.println(numberOfMax);
        out.close();
    }
}