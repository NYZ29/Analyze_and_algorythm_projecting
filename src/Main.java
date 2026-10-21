import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

       int n = in.nextInt();
       int[] colors = new int[101];

       for (int i = 0; i < n; i++) {
           colors[in.nextInt()]++;
       }

       int maxCount = 0;
       for (int i = 0; i < 101; i++) {
           maxCount = Math.max(maxCount, colors[i]);
       }

       int countMaxColor = 0;
       int indexMaxColor = 0;
       for (int i = 0; i < 101; i++) {
           if (colors[i] == maxCount) {
               countMaxColor++;
               indexMaxColor = i;
           }
       }

       if (countMaxColor == 1) out.println(indexMaxColor);
       else out.println(0);

       out.close();
    }
}