import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int n = in.nextInt();
        int positiveSum = 0;
        ArrayList<Integer> positiveIndexes = new ArrayList<>(n);
        int negativeSum = 0;
        ArrayList<Integer> negativeIndexes = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();

            if (x >= 0) {
                positiveSum += x;
                positiveIndexes.add(i + 1);
            }
            if (x <= 0) {
                negativeSum += x;
                negativeIndexes.add(i + 1);
            }
        }

        if (positiveSum > -negativeSum) {
            out.println(positiveIndexes.size());
            for (int posId : positiveIndexes) {
                out.print(posId + " ");
            }
        } else {
            out.println(negativeIndexes.size());
            for (int negId : negativeIndexes) {
                out.print(negId + " ");
            }
        }

        out.close();
    }
}