/*

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(10, 1, 2, 7, 6, 1, 5));
        int B = 8;

        System.out.println(Solution.combinationSum(A, B));
    }
}

 */


import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int diff_x2 = (x1 - x2) * (x1 - x2);
        int diff_y2 = (y1 - y2) * (y1 - y2);

        double ans = Math.sqrt(1.0 * diff_x2 + diff_y2);

        out.printf(Locale.US, "%.5f%n", ans);
        out.close();
    }
}