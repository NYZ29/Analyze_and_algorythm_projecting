import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int m = in.nextInt();

        int mnTime = Integer.MAX_VALUE;
        String nameOfWinner = "";

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int time = 0;

            for (int j = 0; j < m; j++) {
                time += in.nextInt();
            }

            if (time < mnTime) {
                mnTime = time;
                nameOfWinner = name;
            }
        }

        out.println(nameOfWinner);
        out.close();
    }
}