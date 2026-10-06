import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> merged = new ArrayList<>();
        ArrayList<ArrayList<Integer>> indexesAndValues = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            addToHeap(A, indexesAndValues, i, 0);
        }

        int total = 0;
        for (ArrayList<Integer> row : A) {
            total += row.size();
        }

        while (merged.size() < total) {
            merged.add(minDel(A, indexesAndValues));
        }

        return merged;
    }

    private static void addToHeap(
            ArrayList<ArrayList<Integer>> A,
            ArrayList<ArrayList<Integer>> indexesAndValues,
            int i,
            int j
    ) {
        indexesAndValues.add(new ArrayList<>(Arrays.asList(i, j, A.get(i).get(j))));

        int k = indexesAndValues.size() - 1;

        while (k > 0 && indexesAndValues.get(k).get(2) < indexesAndValues.get((k - 1) / 2).get(2)) {
            swap(indexesAndValues, k, (k - 1) / 2);

            k = (k - 1) / 2;
        }
    }

    private static int minDel(
            ArrayList<ArrayList<Integer>> A,
            ArrayList<ArrayList<Integer>> indexesAndValues
    ) {
        int iRow = indexesAndValues.get(0).get(0);
        int jCol = indexesAndValues.get(0).get(1);
        int ans = indexesAndValues.get(0).get(2);

        jCol++;

        int s = indexesAndValues.size() - 1;

        if (jCol < A.get(iRow).size()) {
            indexesAndValues.get(0).set(1, jCol);
            int temp = A.get(iRow).get(jCol);
            indexesAndValues.get(0).set(2, temp);

            int k = 0;

            while (2 * k + 1 <= s) {
                int m = 2 * k + 1;

                if (m + 1 <= s && indexesAndValues.get(m).get(2) > indexesAndValues.get(m + 1).get(2)) m++;

                if (indexesAndValues.get(k).get(2) <= indexesAndValues.get(m).get(2)) break;

                swap(indexesAndValues, k, m);
                k = m;
            }
        } else {
            if (s == 0) {
                indexesAndValues.remove(0);
            } else {
                swap(indexesAndValues, 0, s);
                indexesAndValues.remove(s);
                s--;

                int k = 0;

                while (2 * k + 1 <= s) {
                    int m = 2 * k + 1;

                    if (m + 1 <= s && indexesAndValues.get(m).get(2) > indexesAndValues.get(m + 1).get(2)) m++;

                    if (indexesAndValues.get(k).get(2) <= indexesAndValues.get(m).get(2)) break;

                    swap(indexesAndValues, k, m);
                    k = m;
                }
            }
        }

        return ans;
    }

    private static void swap(
            ArrayList<ArrayList<Integer>> indexesAndValues,
            int i,
            int j
    ) {
        ArrayList<Integer> temp = indexesAndValues.get(i);
        indexesAndValues.set(i, indexesAndValues.get(j));
        indexesAndValues.set(j, temp);
    }
}
