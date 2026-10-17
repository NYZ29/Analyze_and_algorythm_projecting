import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        StringBuilder answer = new StringBuilder().append(in.nextLine()).append(": ");
        ArrayList<String> names = new ArrayList<>(3);

        for (int i = 0; i < 3; i++) {
            names.add(in.nextLine());
        }
        names.sort(null);

        for (int i = 0; i < 3; i++) {
            answer.append(names.get(i));
            if (i < 2) answer.append(", ");
        }

        out.println(answer);
        out.close();
    }
}