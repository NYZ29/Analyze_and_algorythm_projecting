import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = 0;
        for (int a : A) n = Math.max(n, Math.abs(a));
        n++;

        int[] counts = new int[n];

        for (int a : A) counts[Math.abs(a)]++;

        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < counts[i]; j++) {
                squares.add(i * i);
            }
        }

        return squares;
    }
}
