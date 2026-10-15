import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        String line = in.nextLine();
        boolean isKnownFact = true;

        for (int i = 0; i < line.length() && isKnownFact; i++) {
            if (line.charAt(i) != '1') isKnownFact = false;
        }

        out.println((isKnownFact) ? "YES" : "NO");
        out.close();
    }
}