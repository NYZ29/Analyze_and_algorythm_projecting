import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int k = in.nextInt();
        int n = in.nextInt();

        int pageNumber = (int) Math.ceil(1.0 * n / k);
        int rowNumber = n - (pageNumber - 1) * k;

        out.println(pageNumber + " " + rowNumber);
        out.close();
    }
}