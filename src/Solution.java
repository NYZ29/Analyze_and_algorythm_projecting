import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        int l = 0, r = A.size() - 1;
        int indexOfB = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get(m) == B) {
                indexOfB = m;
                break;
            }
            if (A.get(m) < B) l = m + 1;
            else r = m - 1;
        }

        if (indexOfB == -1) return new ArrayList<Integer>(Arrays.asList(-1, -1));

        int first = indexOfB, last = indexOfB;
        while (first > 0 && A.get(first - 1) == B) first--;
        while (last < A.size() - 1 && A.get(last + 1) == B) last++;

        return new ArrayList<Integer>(Arrays.asList(first, last));
    }
}
