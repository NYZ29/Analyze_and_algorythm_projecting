import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public static int solve(ArrayList<Integer> A, int B) {
        int n = A.size();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            maxHeap.offer(A.get(i));
        }

        int sum = 0;
        for (int i = 0; i < B; i++) {
            int max = maxHeap.poll();
            sum += max;

            if (max > 0) maxHeap.offer(max - 1);
        }

        return sum;
    }
}
