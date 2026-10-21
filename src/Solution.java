import java.util.ArrayList;

public class Solution {
    public static int solve(ArrayList<Integer> A, int B) {
        int l = 0, r = A.size() - 1;
        int indexOfMax = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get(m) > A.get(m - 1) && A.get(m) > A.get(m + 1)) {
                indexOfMax = m;
                break;
            }
            if (A.get(m) > A.get(m - 1)) l = m + 1;
            else r = m - 1;
        }

        l = 0;
        r = indexOfMax;
        int ans = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get(m) == B) {
                ans = m;
                break;
            }
            if (A.get(m) < B) l = m + 1;
            else r = m - 1;
        }

        if (ans == -1) {
            l = indexOfMax;
            r = A.size() - 1;

            while (l <= r) {
                int m = (l + r) / 2;
                if (A.get(m) == B) {
                    ans = m;
                    break;
                }
                if (A.get(m) > B) l = m + 1;
                else r = m - 1;
            }
        }

        return ans;
    }
}
