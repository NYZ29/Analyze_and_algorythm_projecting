import java.util.Arrays;

public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        int n = A.length;

        for (int i = 0; i < n; i++) {
            if (i + 1 < n && A[i] == A[i + 1]) continue;

            int greater = n - 1 - i;
            if (A[i] == greater) return 1;
        }

        return -1;
    }
}