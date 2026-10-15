import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        String qwerty = "qwertyuiopasdfghjklzxcvbnm";
        char c = in.next().charAt(0);
        int i = qwerty.indexOf(c);

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(qwerty.charAt((i + 1) % qwerty.length()));
        out.close();
    }
}