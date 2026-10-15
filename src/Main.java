import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int k = in.nextInt();
        String word = in.next();

        out.println(word.substring(0, k - 1) + word.substring(k, word.length()));
        out.close();
    }
}