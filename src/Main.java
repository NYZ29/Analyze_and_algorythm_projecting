import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        String whereBought = in.nextLine();
        int x = in.nextInt();

        String ans = (x % 2 == 0 && whereBought.equals("School")) ? ans = "No" : "Yes";

        out.println(ans);
        out.close();
    }
}