import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int n = in.nextInt();
        int[] numbers = new int[n];

        int sumOfPlus = 0;
        int indexOfMin = 0;
        int indexOfMax = 0;
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        int multiplicationBetweenMinAndMax = 1;

        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();

            if (numbers[i] < mn) {
                mn = numbers[i];
                indexOfMin = i;
            }
            if (numbers[i] > mx) {
                mx = numbers[i];
                indexOfMax = i;
            }
            if (numbers[i] > 0) sumOfPlus += numbers[i];
        }

        mn = Math.min(indexOfMin, indexOfMax);
        mx = Math.max(indexOfMin, indexOfMax);

        for (int i = mn + 1; i < mx; i++) {
            multiplicationBetweenMinAndMax *= numbers[i];
        }

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));
        out.println(sumOfPlus + " " + multiplicationBetweenMinAndMax);
        out.close();
    }
}