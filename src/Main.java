import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        BigInteger c = in.nextBigInteger();

        BigInteger answer = a.max(b).max(c);

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));
        out.println(answer);
        out.close();
    }
}