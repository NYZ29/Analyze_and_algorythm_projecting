import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int x = in.nextInt();
        int y = in.nextInt();

        int winner = 0;
        if (x != 1 || y != 1) {
            if (x == y) winner = 2;
            else winner = 1;
        }

        out.println(winner);
        out.close();
    }
}