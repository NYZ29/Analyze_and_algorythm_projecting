import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        String num = in.next();
        int countOfCircles = 0;

        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);

            if (digit == '0' || digit == '6' || digit == '9') countOfCircles++;
            else if (digit == '8') countOfCircles += 2;
        }

        out.println(countOfCircles);
        out.close();
    }
}