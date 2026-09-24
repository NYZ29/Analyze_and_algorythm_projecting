import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                result.add(A.get(i));
                i++; j++;
            }
            else if (A.get(i) > B.get(j)) j++;
            else i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1000};
        int[] b1 = {1000};

        List<Integer> A = Arrays.stream(a)
                .boxed()
                .toList();

        List<Integer> B1 = Arrays.stream(b1)
                .boxed()
                .toList();

        System.out.println(intersect(A, B1));
    }
}
