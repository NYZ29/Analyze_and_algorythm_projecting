import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(0, 1, 0, 3, 12));

        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(0));

        System.out.println(Solution.solve(A1));
        System.out.println(Solution.solve(A2));
    }
}