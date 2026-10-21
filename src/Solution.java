import java.util.ArrayList;

public class Solution {
    public static int books(ArrayList<Integer> A, int B) {
        int n = A.size();

        if (n == 0 || B <= 0 || n < B) {
            return -1;
        }

        long low = 0;
        long high = 0;

        for (int pages : A) {
            low = Math.max(low, pages);
            high += pages;
        }

        long ans = high;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (canAllocate(A, B, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }

    private static boolean canAllocate(ArrayList<Integer> A, int B, long limit) {
        long currentPages = 0;
        int students = 1;

        for (int pages : A) {
            if (pages > limit) return false;

            if (currentPages + pages <= limit) {
                currentPages += pages;
            } else {
                students++;
                currentPages = pages;

                if (students > B) {
                    return false;
                }
            }
        }

        return true;
    }
}
