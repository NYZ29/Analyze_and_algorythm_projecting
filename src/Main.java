import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int[] sequence = in.nextLine().chars().map(c -> c -'0').toArray();
        int floor = 0;
        int mnFloor = 0;
        int mxFloor = 0;

        for (int seq : sequence) {
            if (seq == 1) {
                floor++;
                mxFloor = Math.max(mxFloor, floor);
            }
            else {
                floor--;
                mnFloor = Math.min(mnFloor, floor);
            }
        }

        out.println(mxFloor - mnFloor + 1);
        out.close();
    }
}