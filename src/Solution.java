import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> merged = new ArrayList<>();
        int[] indexes = new int[A.size()];
        int count = 0;

        while (count < A.size() * A.get(0).size())
            count = mergeKSortedArrays(A, merged, indexes, count);

        return merged;
    }

    private static int mergeKSortedArrays(
            ArrayList<ArrayList<Integer>> A,
            ArrayList<Integer> merged,
            int[] indexes,
            int count
    ) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); i++) {
            if (indexes[i] < A.get(i).size())
                min = Math.min(min, A.get(i).get(indexes[i]));
        }

        for (int i = 0; i < A.size(); i++) {
            if (indexes[i] < A.get(i).size() && A.get(i).get(indexes[i]) == min) {
                merged.add(A.get(i).get(indexes[i]));
                indexes[i]++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>(
                List.of(
                        new ArrayList<>(List.of(1, 2, 3)),
                        new ArrayList<>(List.of(2, 4, 6)),
                        new ArrayList<>(List.of(0, 9, 10))
                )
        );

        ArrayList<Integer> merged = solve(A);

        System.out.println(merged);
    }
}
