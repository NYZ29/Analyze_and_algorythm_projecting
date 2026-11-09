import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        Set<ArrayList<Integer>> answer = new HashSet<>();
        Collections.sort(a);

        int n = a.size();

        int N = 1 << n;
        for (int q = 0; q < N; q++) {
            int s = 0;
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {

                if ((q & (1 << i)) != 0) {
                    s += a.get(i);
                    ans.add(a.get(i));
                }
            }
            if (s == b) {
                answer.add(ans);
            }
        }

        return new ArrayList<>(answer);
    }
}