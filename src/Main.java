import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int n = in.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) numbers[i] = in.nextInt();

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        for (int i = n - 1; i >= 0; i--) out.print(numbers[i] + " ");

        out.close();
    }
}