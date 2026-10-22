import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("INPUT.TXT"));
        PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"));

        String pos = in.next();
        char letter = pos.charAt(0);
        int num = pos.charAt(1) - '0';

        char[] letters = new char[8];
        letters[0] = (char)(letter - 2);
        letters[1] = (char)(letter - 2);
        letters[2] = (char)(letter - 1);
        letters[3] = (char)(letter - 1);
        letters[4] = (char)(letter + 1);
        letters[5] = (char)(letter + 1);
        letters[6] = (char)(letter + 2);
        letters[7] = (char)(letter + 2);

        int[] nums = new int[8];
        nums[0] = num - 1;
        nums[1] = num + 1;
        nums[2] = num - 2;
        nums[3] = num + 2;
        nums[4] = num - 2;
        nums[5] = num + 2;
        nums[6] = num - 1;
        nums[7] = num + 1;

        for (int i = 0; i < 8; i++) {
            if (letters[i] >= 'a' && letters[i] <= 'h' &&
            nums[i] >= 1 && nums[i] <= 8) {
                out.print(letters[i]);
                out.println(nums[i]);
            }
        }

        out.close();
    }
}