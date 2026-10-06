import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>(
                List.of(
                        new ArrayList<>(List.of(1, 2, 3)),
                        new ArrayList<>(List.of(2, 4 ,6)),
                        new ArrayList<>(List.of(0, 9, 10))
                )
        );

        ArrayList<Integer> merged = Solution.solve(A);

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}