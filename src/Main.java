import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int a = 0, b = 0;
        for (int i = 0; i < 4; i++) {
            a += in.nextInt();
            b += in.nextInt();
        }

        String answer = "";
        if (a > b) answer = "1";
        else if (a < b) answer = "2";
        else answer = "DRAW";

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(answer);
        out.close();
    }
}