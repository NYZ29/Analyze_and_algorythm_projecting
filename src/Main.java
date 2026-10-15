import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));

        int k = in.nextInt();
        String[] flowerPermutations = {"GCV", "GVC", "VGC", "VCG", "CVG", "CGV"};

        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        out.println(flowerPermutations[(k % 3) * 2]);
        out.close();
    }
}