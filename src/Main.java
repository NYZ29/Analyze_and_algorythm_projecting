import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int tRoom = in.nextInt();
        int tCond = in.nextInt();
        String mode = in.next();

        int answer = tRoom;
        if (mode.equals("auto") || (tRoom < tCond && mode.equals("heat")) || (tRoom > tCond && mode.equals("freeze"))) answer = tCond;

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(answer);
        out.close();
    }
}