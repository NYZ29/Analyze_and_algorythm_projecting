import java.util.ArrayList;

public class Solution {
    public static int solve(ArrayList<Integer> A, int B) {
        if (A.get(A.size() - 1) <= B) return A.size();

        int l = 0, r = A.size() - 1;
        int ans = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get(m) == B + 1) {
                ans = m;
                break;
            }
            if (A.get(m) < B + 1) l = m + 1;
            else r = m - 1;
        }
        if (ans == -1) ans = l;

        while (ans > 1 && A.get(ans - 1) > B) ans--;

        return ans;
    }
}
