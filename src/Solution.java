public class Solution {
    public static int sqrt(int A) {
        long l = 0, r = Integer.MAX_VALUE;
        long ans = 1;

        while (l <= r) {
            long m = (l + r) / 2;
            if (m * m <= A && (m + 1) * (m + 1) > A) {
                ans = m;
                break;
            }
            if (m * m <= A) l = m + 1;
            else r = m - 1;
        }

        return (int)ans;
    }
}
