import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        String answer = (x + y >= z) ? Integer.toString(x + y - z) : "Impossible";

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(answer);
        out.close();
    }
}