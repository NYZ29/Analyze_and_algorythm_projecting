import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();

        int heightOfBus = 437;
        int bridgeWhereCrash = 0;

        for (int i = 0; i < n && bridgeWhereCrash == 0; i++) {
            int h = in.nextInt();

            if (h <= heightOfBus) {
                bridgeWhereCrash = i + 1;
            }
        }

        StringBuilder answer = new StringBuilder();
        if (bridgeWhereCrash == 0) answer.append("No crash");
        else answer.append("Crash ").append(bridgeWhereCrash);

        out.println(answer);
        out.close();
    }
}