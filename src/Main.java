import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int count = 0;
        for (int i = 0; i < 31; i++) {
            count += in.nextInt();
        }

        out.println(count / 27);
        out.close();
    }
}