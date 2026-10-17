import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        in.nextLine();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String grammatic = in.nextLine();
            if (grammatic.charAt(0) == grammatic.charAt(3)) count++;
        }

        out.println(count);
        out.close();
    }
}