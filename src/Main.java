import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(-6, -3, -1, 2, 4, 5));

        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(-5, -4, -2, 0, 1));

        System.out.println(Solution.solve(A1));
        System.out.println(Solution.solve(A2));
    }
}