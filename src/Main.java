import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(10, 1, 2, 7, 6, 1, 5));
        int B = 8;

        System.out.println(Solution.combinationSum(A, B));
    }
}