import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int n = in.nextInt();
        String answer;

        if (n == 1 || n == 2 || n == 12) answer = "Winter";
        else if (n >= 3 && n <= 5) answer = "Spring";
        else if (n >= 6 && n <= 8) answer = "Summer";
        else if (n >= 9 && n <= 11) answer = "Autumn";
        else answer = "Error";

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(answer);
        out.close();
    }
}