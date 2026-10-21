import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        int n = A.size();
        if (B > n) return new ArrayList<>();

        ArrayList<Integer> ans = new ArrayList<>(n - B + 1);
        if (B == 1) {
            for (int i = 0; i < n; i++) {
                ans.add(1);
            }
            return ans;
        }

        Map<Integer, Integer> numbers = new HashMap<>(B);

        for (int i = 0; i < B; i++) {
            addNumber(numbers, A.get(i));
        }
        ans.add(numbers.size());

        for (int right = B; right < n; right++) {
            int left = right - B;

            addNumber(numbers, A.get(right));
            removeNumber(numbers, A.get(left));

            ans.add(numbers.size());
        }

        return ans;
    }

    private static void addNumber(Map<Integer, Integer> numbers, int value) {
        numbers.merge(value, 1, Integer::sum);
    }

    private static void removeNumber(Map<Integer, Integer> numbers, int value) {
        numbers.merge(value, -1, Integer::sum);

        if (numbers.get(value) == 0) {
            numbers.remove(value);
        }
    }
}
