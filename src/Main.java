import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int year = in.nextInt();
        StringBuilder answer = new StringBuilder();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) answer.append(12);
        else answer.append(13);

        answer.append("/09/").append(Integer.toString(10000 + year).substring(1, 5));

        out.println(answer);
        out.close();
    }
}