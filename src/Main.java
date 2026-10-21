import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int num = in.nextInt();

            int num1 = num - 1;
            int sumFirst1 = (num1 / 100_000) + (num1 / 10_000) % 10 + (num1 / 1_000) % 10;
            int sumLast1 = (num1 / 100) % 10 + (num1 / 10) % 10 + num1 % 10;

            int num2 = num + 1;
            int sumFirst2 = (num2 / 100_000) + (num2 / 10_000) % 10 + (num2 / 1_000) % 10;
            int sumLast2 = (num2 / 100) % 10 + (num2 / 10) % 10 + num2 % 10;

            if (sumFirst1 == sumLast1 || sumFirst2 == sumLast2) out.println("Yes");
            else out.println("No");
        }

        out.close();
    }
}