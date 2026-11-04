import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<>(List.of(12, 13));

        System.out.println(Solution.subsets(A1));
    }
}