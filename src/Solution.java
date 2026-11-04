import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);

        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        dp.add(new ArrayList<>());

        for (int x : A) {
            int size = dp.size();

            for (int i = 0; i < size; i++) {
                ArrayList<Integer> next = new ArrayList<>(dp.get(i));
                next.add(x);
                dp.add(next);
            }
        }

        dp.sort((a, b) -> {
            int n = Math.min(a.size(), b.size());

            for (int i = 0; i < n; i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }

            return Integer.compare(a.size(), b.size());
        });

        return dp;
    }
}
