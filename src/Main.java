import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        StringBuilder ans = new StringBuilder();

        if (a == 0 && b == 0 && c == 0) ans.append(0);
        else {
            if (a != 0) {
                ans.append(a);

                if (b == 1) ans.append('+').append('x');
                else if (b == -1) ans.append('-').append('x');
                else if (b > 0) ans.append('+').append(b).append('x');
                else if (b < 0) ans.append(b).append('x');

                if (c == 1) ans.append('+').append('y');
                else if (c == -1) ans.append('-').append('y');
                else if (c > 0) ans.append('+').append(c).append('y');
                else if (c < 0) ans.append(c).append('y');
            }
            else {
                if (b == 1) ans.append('x');
                else if (b == -1) ans.append('-').append('x');
                else if (b > 0) ans.append(b).append('x');
                else if (b < 0) ans.append(b).append('x');

                if (c == 1 && b == 0) ans.append('y');
                else if (c == 1) ans.append('+').append('y');
                else if (c == -1) ans.append('-').append('y');
                else if (c > 0 && b == 0) ans.append(c).append('y');
                else if (c > 0) ans.append('+').append(c).append('y');
                else if (c < 0) ans.append(c).append('y');
            }
        }

        out.println(ans);
        out.close();
    }
}