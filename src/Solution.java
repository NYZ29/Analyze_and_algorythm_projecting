import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        if (n <= 1) return A;

        int insertPose = 0;
        for (int i = 0; i < n; i++) {
            if (A.get(i) !=0) {
                A.set(insertPose, A.get(i));
                insertPose++;
            }
        }

        for (int i = insertPose; i < n; i++) A.set(i, 0);

        return A;
    }
}
