import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int k = in.nextInt();
        int speed = (20 - 8) * (60 / 10) * 2 + 1;

        StringBuilder answer = new StringBuilder();
        if (k > speed) answer.append("NO");
        else {
            int neededTime = (k - 1) * 5;
            answer.append(neededTime / 60).append(' ').append(neededTime % 60);
        }

        out.println(answer);
        out.close();
    }
}